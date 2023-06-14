package page;

import member.UserInIt;

import javax.swing.*;
import java.awt.*;

public class GuestInfoPage extends JPanel {
    public GuestInfoPage(JPanel panel) {
        Font ft;
        ft = new Font("함초롱돋움", Font.BOLD, 15);

        setLayout(null);

        Rectangle rect = panel.getBounds();
        System.out.println(rect);
        setPreferredSize(rect.getSize());

        JPanel namePanel = new JPanel();
        namePanel.setBounds(0, 100, 1000, 50);
        add(namePanel);
        Label nameLabel = new Label("성 명 : ");
        nameLabel.setFont(ft);
        nameLabel.setBackground(Color.BLUE);
        JLabel nameField = new JLabel();
        nameField.setFont(ft);
        nameField.setText(UserInIt.getmUser().getName());
        namePanel.add(nameLabel);
        namePanel.add(nameField);

        JPanel phonePanel = new JPanel();
        phonePanel.setBounds(0, 150, 1000, 50);
        add(phonePanel);
        Label phoneLabel = new Label("연락처 : ");
        phoneLabel.setFont(ft);
        JLabel phoneField = new JLabel();
        phoneField.setFont(ft);
        phoneField.setText(String.valueOf(UserInIt.getmUser().getPhone()));
        phonePanel.add(phoneLabel);
        phonePanel.add(phoneField);
    }

//    public static void main(String[] args) {
//        JFrame frame = new JFrame();
//        frame.setBounds(0, 0, 1000, 750);
//        frame.setLayout(null);
//
//        JPanel mPagePanel = new JPanel();
//        mPagePanel.setBounds(0, 0, 1000, 750);
//
//        frame.add(mPagePanel);
//        mPagePanel.add("", new GuestInfoPage(mPagePanel));
//        frame.setVisible(true);
//    }
}
