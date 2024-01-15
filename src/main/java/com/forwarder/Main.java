package com.forwarder;

import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        FlatDarkLaf.setup();
        JFrame frame = new JFrame("Forwarder");
        boolean printSize = false;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Panel().panel1);
        frame.setSize(400, 377);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        while(printSize) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(frame.getSize());
        }
    }
}