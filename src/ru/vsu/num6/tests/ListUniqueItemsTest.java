package ru.vsu.num6.tests;

import org.junit.Test;
import ru.vsu.num6.common.ListUniqueItems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ListUniqueItemsTest {

    @Test
    public void testGetUniqueList1() {
        ListUniqueItems listUniqueItems = new ListUniqueItems();
        List<Integer> actualList = listUniqueItems.getUniqueList(
                listUniqueItems.removeDuplicateItemsList(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5))),
                listUniqueItems.removeDuplicateItemsList(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9))));
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        assertEquals(actualList, expectedList);
    }

    @Test
    public void testGetUniqueList2() {
        ListUniqueItems listUniqueItems = new ListUniqueItems();
        List<Integer> actualList = listUniqueItems.getUniqueList(
                listUniqueItems.removeDuplicateItemsList(new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1))),
                listUniqueItems.removeDuplicateItemsList(new ArrayList<>(Arrays.asList(9, 8, 7, 6, 5, 4))));
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1, 9, 8, 7, 6));
        assertEquals(actualList, expectedList);
    }

    @Test
    public void testGetUniqueList3() {
        ListUniqueItems listUniqueItems = new ListUniqueItems();
        List<Integer> actualList = listUniqueItems.getUniqueList(
                listUniqueItems.removeDuplicateItemsList(new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4))),
                listUniqueItems.removeDuplicateItemsList(new ArrayList<>(Arrays.asList(0, 2, 3, 5, 6))));
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 0, 5, 6));
        assertEquals(actualList, expectedList);
    }

    @Test
    public void testGetUniqueList4() {
        ListUniqueItems listUniqueItems = new ListUniqueItems();
        List<Integer> actualList = listUniqueItems.getUniqueList(
                listUniqueItems.removeDuplicateItemsList(new ArrayList<>(Arrays.asList(10, 20, 2, 10, 1))),
                listUniqueItems.removeDuplicateItemsList(new ArrayList<>(Arrays.asList(11, 10, 2, 15))));
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(10, 20, 2, 1, 11, 15));
        assertEquals(actualList, expectedList);
    }

    @Test
    public void testGetUniqueList5() {
        ListUniqueItems listUniqueItems = new ListUniqueItems();
        List<Integer> actualList = listUniqueItems.getUniqueList(
                listUniqueItems.removeDuplicateItemsList(new ArrayList<>(Arrays.asList(1, 2, 10, 12))),
                listUniqueItems.removeDuplicateItemsList(new ArrayList<>(Arrays.asList(9, 10, 15, 15, 1, 2))));
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2, 10, 12, 9, 15));
        assertEquals(actualList, expectedList);
    }
}