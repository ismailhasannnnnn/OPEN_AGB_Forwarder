package com.forwarder;

import com.googlecode.vfsjfilechooser2.VFSJFileChooser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class Panel {
    public JPanel panel1;
    private JTextField romPath;
    private JLabel romPathLabel;
    private JButton selectROMButton;
    private JTextField bannerPath;
    private JTextField textField1;
    private JButton generateButton;

    public Panel() {

        romPath.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        romPath.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                VFSJFileChooser fileChooser = new VFSJFileChooser();
                fileChooser.setFileHidingEnabled(false);
                fileChooser.setMultiSelectionEnabled(false);
                fileChooser.setFileSelectionMode(VFSJFileChooser.SELECTION_MODE.FILES_ONLY);
                fileChooser.setDialogTitle("Select ROM");
                fileChooser.showOpenDialog(null);
                File rom = fileChooser.getSelectedFile();
                String romPathString = "";
                // check if the path of the rom contains "roms", and modify the path to start with "sdmc:/roms"
                try {
                    if (rom.getAbsolutePath().contains("roms")) {
                        romPathString = "sdmc:/" + rom.getAbsolutePath().substring(rom.getAbsolutePath().indexOf("roms"));
                    } else {
                        // alert user that the path needs to contain "roms"
                        JOptionPane.showMessageDialog(null, "The path of the ROM must contain \"roms\".");
                        return;
                    }
                } catch (NullPointerException exception) {
                    // user didn't select a file
                    return;
                }
                romPath.setText(romPathString);
            }
        });
    }
}
