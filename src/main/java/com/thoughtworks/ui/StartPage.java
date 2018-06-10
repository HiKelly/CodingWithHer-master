package com.thoughtworks.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPage extends  JFrame{

    private JButton openBtn = new JButton(new ImageIcon("src/main/resources/startPage.PNG"));
    private JPanel openPanel = new JPanel(new GridLayout());

    public StartPage() {
        setTitle("生命游戏");
        openBtn.addActionListener(new Start());
        openPanel.add(openBtn);
        this.setSize(1000, 1200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(openPanel);
    }

    private class Start implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            new GameOfLifeFrame();
        }
    }

}