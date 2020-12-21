package ru.vsu.num6.gui.view;

import ru.vsu.num6.gui.listener.RemoveDuplicateElementsListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ProgramPanel extends JPanel {
    private final JButton createListUniqueItems = new JButton("Apply");
    private final JTextField inputDataList1 = new JTextField();
    private final JTextField inputDataList2 = new JTextField();
    private final JTextField outputUniqueItems = new JTextField();
    private final JLabel labelInput1 = new JLabel("Enter the elements of the first list:");
    private final JLabel labelInput2 = new JLabel("Enter the elements of the second list:");
    private final JLabel labelOutput = new JLabel("Unique items from two lists:");

    public ProgramPanel() {
        this.setLayout(null);
        addLabelInput();
        addInputDataLists();
        addLabelOutput();
        addOutputUniqueItems();
        addCreateListUniqueItems();
    }

    private void addLabelInput() {
        this.setBackground(new Color(229, 231, 233));
        labelInput1.setBounds(5, 5, 250, 30);
        this.add(labelInput1);
        labelInput2.setBounds(5, 40, 250, 30);
        this.add(labelInput2);
    }

    private void addInputDataLists() {
        inputDataList1.addKeyListener(new RestrictionCharacterInput());
        inputDataList1.setBounds(255, 5, 150, 30);
        this.add(inputDataList1);
        inputDataList2.addKeyListener(new RestrictionCharacterInput());
        inputDataList2.setBounds(255, 40, 150, 30);
        this.add(inputDataList2);
    }

    private void addLabelOutput() {
        labelOutput.setBounds(5, 85, 180, 30);
        this.add(labelOutput);
    }

    private void addOutputUniqueItems() {
        outputUniqueItems.setBounds(200, 85, 200, 30);
        outputUniqueItems.setEditable(false);
        this.add(outputUniqueItems);
    }

    private void addCreateListUniqueItems() {
        createListUniqueItems.setBackground(new Color(119,221, 119));
        createListUniqueItems.setCursor(new Cursor(Cursor.HAND_CURSOR));
        createListUniqueItems.setBounds(175, 350, 100, 30);
        createListUniqueItems.addActionListener(new RemoveDuplicateElementsListener(inputDataList1, inputDataList2,
                outputUniqueItems));
        this.add(createListUniqueItems);
    }

    private class RestrictionCharacterInput extends KeyAdapter {
        @Override
        public void keyTyped(KeyEvent keyEvent) {
            char symbol = keyEvent.getKeyChar();
            if ((symbol < '0' || symbol > '9') && symbol != KeyEvent.VK_COMMA && symbol != KeyEvent.VK_SEMICOLON &&
                    symbol != KeyEvent.VK_SPACE) {
                keyEvent.consume();
            }
        }
    }
}
