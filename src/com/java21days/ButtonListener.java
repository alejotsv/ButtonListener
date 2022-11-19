package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener extends JFrame implements ActionListener {
    Dimension dim = new Dimension(200, 200);
    int clickCounter = 0;

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
        clickCounter++;
        if(clickCounter==1){
            System.out.println("This has been clicked 1 time");
        } else {
            System.out.println("This has been clicked " + clickCounter + " times");
        }
    }
}
