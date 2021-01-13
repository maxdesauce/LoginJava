package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame  implements ActionListener {

    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    private JLabel userlabel = new JLabel("USER");
    private JLabel passwordlabel = new JLabel("PASSWORD");
    private JLabel confirmlabel = new JLabel("");
    private JTextField username = new JTextField();
    private JTextField password = new JTextField("0000000");
    private JButton log = new JButton("Login");


    public login(){

        frame.setTitle("Login");
        frame.setSize(350,250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.add(panel);
        frame.add(userlabel);
        frame.add(passwordlabel);
        frame.add(confirmlabel);
        frame.add(username);
        frame.add(password);
        frame.add(log);

        panel.setLayout(null);
        panel.setOpaque(true);
        panel.setBackground(Color.cyan);


        userlabel.setBounds(10,20,80,25);
        userlabel.setForeground(Color.blue);
        passwordlabel.setBounds(10,50,80,25);
        passwordlabel.setForeground(Color.blue);
        username.setBounds(100,20,165,25);
        password.setBounds(100,50,165,25);

        log.setBounds(10,80,80,25);
        confirmlabel.setBounds(10,110,300,25);
        confirmlabel.setForeground(Color.green);

        log.addActionListener((ActionListener) this);



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(log)) {
            String user = username.getText();
            String pass = password.getText();

            if (user.equals("maxdesauce") && pass.equals("Sametoo9")) {
                confirmlabel.setText("Login Successful!");
            }
        } else{
            return;
        }

    }
}
