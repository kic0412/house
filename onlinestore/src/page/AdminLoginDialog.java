package page;

import javax.swing.*;
import java.awt.*;

public class AdminLoginDialog extends JDialog {
    JTextField pwField, idField;
    public boolean isLogin = false;

    public AdminLoginDialog(JFrame frame, String str) {
        super(frame, "관리자 로그인", true);
        Font ft;
        ft = new Font("함초롱돋움", Font.BOLD, 15);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((screenSize.width - 400) / 2, (screenSize.height - 300) / 2);
        setSize(400, 300);
        setLayout(null);

        JPanel titlePanel = new JPanel();
        titlePanel.setBounds(0, 20, 400, 50);
        add(titlePanel);
        JLabel titleLable = new JLabel("관리자 로그인");
        titleLable.setFont(new Font("함초롱돋움", Font.BOLD, 20));
        titlePanel.add(titleLable);

        JPanel idPanel = new JPanel();
        idPanel.setBounds(0, 70, 400, 50);
        add(idPanel);
        JLabel idLable = new JLabel("ID : ");
        idLable.setFont(ft);
        idField = new JTextField(10);
        idField.setFont(ft);
        idPanel.add(idLable);
        idPanel.add(idField);

        JPanel pwPanel = new JPanel();
        pwPanel.setBounds(0, 120, 400, 50);
        add(pwPanel);
        JLabel pwLable = new JLabel("PWD : ");
        pwLable.setFont(ft);
        pwField = new JTextField(10);
        pwField.setFont(ft);
        pwPanel.add(pwLable);
        pwPanel.add(pwField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(0, 170, 400, 50);
        add(buttonPanel);
        JLabel okLable = new JLabel("확인");
        okLable.setFont(ft);
        JButton okButton = new JButton();
        okButton.add(okLable);
        buttonPanel.add(okButton);

        JLabel cancleLable = new JLabel("취소");
    }
}
