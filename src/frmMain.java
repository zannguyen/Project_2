import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmMain extends JFrame implements ActionListener {

    JButton btnBCNN, btnUCLN, btnMin;

    public frmMain() {
        setTitle("Ung dung Toan hoc Co ban");
        setSize(300, 120); // Thay doi kich thuoc cho phu hop voi 3 nut
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        btnBCNN = new JButton("BCNN");
        btnUCLN = new JButton("UCLN");
        btnMin = new JButton("Min");

        btnBCNN.addActionListener(this);
        btnUCLN.addActionListener(this);
        btnMin.addActionListener(this);

        add(btnBCNN);
        add(btnUCLN);
        add(btnMin);

        setVisible(true);
        setLocationRelativeTo(null); // Hien thi cua so o giua man hinh
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnBCNN) {
            new frmBCNN().setVisible(true);
        } else if (e.getSource() == btnUCLN) {
            new frmUCLN().setVisible(true);
        } else if (e.getSource() == btnMin) {
            new frmMin2so().setVisible(true);
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            //System.out.println("Đang khởi tạo frmMain");
            new frmMain().setVisible(true); // THÊM setVisible
        });
    }
}