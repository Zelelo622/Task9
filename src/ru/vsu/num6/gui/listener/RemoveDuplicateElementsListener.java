package ru.vsu.num6.gui.listener;

import ru.vsu.num6.common.ListUniqueItems;
import ru.vsu.num6.utils.ArrayUtils;
import ru.vsu.num6.utils.ListUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class RemoveDuplicateElementsListener implements ActionListener {

    private JTextField inputDataList1;
    private JTextField inputDataList2;
    private JTextField outputUniqueItems;

    public RemoveDuplicateElementsListener(JTextField inputDataList1,JTextField inputDataList2,
                                           JTextField outputUniqueItems) {
        this.inputDataList1 = inputDataList1;
        this.inputDataList2 = inputDataList2;
        this.outputUniqueItems = outputUniqueItems;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ListUtils listUtils = new ListUtils();
        ListUniqueItems listUniqueItems = new ListUniqueItems();
        int[] firstArray = ArrayUtils.toIntArray(inputDataList1.getText());
        List<Integer> list1 = listUtils.addArrayElementsToList(firstArray);
        int[] secondArray = ArrayUtils.toIntArray(inputDataList2.getText());
        List<Integer> list2 = listUtils.addArrayElementsToList(secondArray);
        outputUniqueItems.setText(
                String.valueOf(listUniqueItems.getUniqueList(listUniqueItems.removeDuplicateItemsList(list1),
                        listUniqueItems.removeDuplicateItemsList(list2))));
    }
}
