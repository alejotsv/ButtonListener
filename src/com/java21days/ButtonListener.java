package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener extends JFrame implements ActionListener {
    Dimension dim = new Dimension(250, 100);
    int clickCounter = 0;
    JLabel label = new JLabel("Button clicked " + clickCounter + " times");

    ButtonListener(String title, String button){
        super(title);
        setSize(dim);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        JButton btn = new JButton(button);
        btn.addActionListener(this);
        panel.add(label);
        panel.add(btn);
        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        clickCounter++;
        if(clickCounter==1){
            label.setText("This has been clicked 1 time");
        } else {
            label.setText("This has been clicked " + clickCounter + " times");
        }
    }
}
