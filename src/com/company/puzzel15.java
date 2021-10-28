package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class puzzel15 extends JFrame implements ActionListener {
    JFrame puzzel=new JFrame();
    JPanel gamePanel = new JPanel();
    JButton[] buttons=new JButton[15];

    public puzzel15() {
        puzzel.add(gamePanel);
        gamePanel.setLayout(new GridLayout(4,4));
        String nr="";
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            if (i != buttons.length - 1) {
                buttons[i].setText(Integer.toString(i + 1));
            }
            buttons[i].addActionListener(this);
            gamePanel.add(buttons[i]);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ()
    }
}
