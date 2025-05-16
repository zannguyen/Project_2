import javax.swing.*;
import java.awt.event.*;

public class frmMin2so extends JFrame implements ActionListener {
    private JTextField txtA, txtB;
    private JButton btnFindMin;
    private JLabel lblResult;

    public frmMin2so() {
        setTitle("Tìm số nhỏ nhất");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblA = new JLabel("Số A:");
        lblA.setBounds(20, 20, 80, 25);
        add(lblA);

        txtA = new JTextField();
        txtA.setBounds(100, 20, 150, 25);
        add(txtA);

        JLabel lblB = new JLabel("Số B:");
        lblB.setBounds(20, 60, 80, 25);
        add(lblB);

        txtB = new JTextField();
        txtB.setBounds(100, 60, 150, 25);
        add(txtB);

        btnFindMin = new JButton("Tìm Min");
        btnFindMin.setBounds(100, 100, 100, 25);
        btnFindMin.addActionListener(this);
        add(btnFindMin);

        lblResult = new JLabel("");
        lblResult.setBounds(20, 130, 250, 25);
        add(lblResult);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());
            double min = Math.min(a, b);
            lblResult.setText("Số nhỏ nhất là: " + min);
        } catch (NumberFormatException ex) {
            lblResult.setText("Vui lòng nhập số hợp lệ!");
        }
    }

    public static void main(String[] args) {
        new frmMin2so();
    }
}
