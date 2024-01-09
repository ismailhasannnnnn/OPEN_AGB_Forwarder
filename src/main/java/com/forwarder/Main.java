package com.forwarder;

import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        FlatDarkLaf.setup();
        JFrame frame = new JFrame("Forwarder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Panel().panel1);
        frame.setSize(531, 377);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}