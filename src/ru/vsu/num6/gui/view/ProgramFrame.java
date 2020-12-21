package ru.vsu.num6.gui.view;

import javax.swing.*;

public class ProgramFrame extends JFrame {
    public ProgramFrame() {
        ProgramPanel programPanel = new ProgramPanel();
        this.add(programPanel);
        this.setTitle("Task9");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setBounds(300, 150, 450, 450);
    }
}
