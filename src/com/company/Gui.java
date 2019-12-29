package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
    static int state[] = new int[9];
    static int player = 0;
    static int gewinner = 0;
    JFrame jf;
    Draw draw;
    JButton btnreset;

    static JButton btn[] = new JButton[9];

    public Gui() {
        jf = new JFrame();
        jf.setSize(800, 600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);
        jf.setTitle("Tic Tac Toe");

        for (int i = 0; i < btn.length; i++) {
            btn[i] = new JButton();
            btn[i].setVisible(true);
            btn[i].addActionListener(new Actionhandler());
            btn[i].setFocusPainted(false);
            btn[i].setContentAreaFilled(false);
            btn[i].setBorder(null);
            jf.add(btn[i]);
        }

        ButtonPlacement.place();

        btnreset = new JButton("Reset");

        btnreset.setBounds(675, 500, 100, 40);
        btnreset.setVisible(true);
        btnreset.setBackground(new Color(51, 102, 153));
        btnreset.setForeground(Color.BLACK);
        btnreset.setFocusPainted(false);
        btnreset.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Funktion.reset();

            }
        });

        jf.add(btnreset);

        draw = new Draw();
        draw.setBounds(0, 0, 800, 600);
        draw.setVisible(true);
        jf.add(draw);

        jf.setVisible(true);

    }

}
