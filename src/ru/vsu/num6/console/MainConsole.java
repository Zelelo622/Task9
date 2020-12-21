package ru.vsu.num6.console;

import ru.vsu.num6.common.ListUniqueItems;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class MainConsole {

    public static void main(String[] args) throws IOException {
        ListUniqueItems listUniqueItems = new ListUniqueItems();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        readFile(args, list1, list2);
        writeFile(listUniqueItems.getUniqueList(listUniqueItems.removeDuplicateItemsList(list1),
                listUniqueItems.removeDuplicateItemsList(list2)), args);
    }

    private static void writeFile(List<Integer> listFinal, String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter(args[1]);
        fileWriter.write(String.valueOf(listFinal));
        fileWriter.close();
    }

    private static void readFile(String[] args, List<Integer> list1, List<Integer> list2) {
        Scanner scanner;
        File file = new File(args[0]);
        try {
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                list1.add(scanner.nextInt());
                list2.add(scanner.nextInt());
            }
            scanner.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found");
        }
    }
}
