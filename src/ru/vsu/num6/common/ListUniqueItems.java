package ru.vsu.num6.common;

import java.util.*;

public class ListUniqueItems {

    public List<Integer> getUniqueList(List<Integer> list1, List<Integer> list2) {
        List<Integer> uniqueList = new ArrayList<>(list1);
        for (int i = 0; i < list2.size(); i++) {
            int count = 0;
            for (int j = 0; j < list1.size(); j++) {
                if (list2.get(i).equals(list1.get(j))) {
                    count++;
                }
            }
            if (count == 0) {
                uniqueList.add(list2.get(i));
            }
        }
        return uniqueList;
    }

    public List<Integer> removeDuplicateItemsList(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                }
            }
        }
        return list;
    }
}
