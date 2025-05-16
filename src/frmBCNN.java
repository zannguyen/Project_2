import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class frmBCNN extends JFrame {
    private JTextField txtSo1, txtSo2, txtKetQua;
    private JButton btnTinh;

    public frmBCNN() {
        setTitle("Tính BCNN của hai số");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 5, 5));

        // Tạo các thành phần giao diện
        add(new JLabel("Số thứ nhất:"));
        txtSo1 = new JTextField();
        add(txtSo1);

        add(new JLabel("Số thứ hai:"));
        txtSo2 = new JTextField();
        add(txtSo2);

        add(new JLabel("BCNN:"));
        txtKetQua = new JTextField();
        txtKetQua.setEditable(false);
        add(txtKetQua);

        btnTinh = new JButton("Tính BCNN");
        add(btnTinh);

        // Thêm sự kiện nút
        btnTinh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(txtSo1.getText());
                    int b = Integer.parseInt(txtSo2.getText());
                    int bcnn = (a * b) / gcd(a, b);
                    txtKetQua.setText(String.valueOf(bcnn));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frmBCNN.this,
                        "Vui lòng nhập số nguyên hợp lệ!",
                        "Lỗi nhập liệu",
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    // Hàm tìm UCLN (Euclid)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return Math.abs(a);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new frmBCNN().setVisible(true);
        });
    }
}

