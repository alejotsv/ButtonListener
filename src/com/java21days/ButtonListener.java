package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener extends JFrame implements ActionListener {
    Dimension dim = new Dimension(500, 500);

    ButtonListener(String title, String button){
        super(title);
        setSize(dim);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        JButton btn = new JButton(button);
        btn.addActionListener(this);
        panel.add(btn);
        add(panel);

        setVisible(true);
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("This was clicked");
    }
}
