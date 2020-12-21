package ru.vsu.num6.utils;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {

    public List<Integer> addArrayElementsToList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }
        return list;
    }
}
