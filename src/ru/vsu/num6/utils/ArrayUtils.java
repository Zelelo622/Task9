package ru.vsu.num6.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * Набор функций для работы с оконными приложениями с ипользованием Swing
 *
 * @author Дмитрий Соломатин (кафедра ПиИТ ФКН ВГУ)
 */

public class ArrayUtils {

    public static int[] toIntArray(String str) {
        Scanner scanner = new Scanner(str);
        scanner.useLocale(Locale.ROOT);
        scanner.useDelimiter("(\\s|[,;])+");
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }

        // из List<Integer> можно получить Integer[]
        Integer[] arr = list.toArray(new Integer[0]);
        // Integer[] -> int[]
        return ArrayUtils.toPrimitive(arr);
    }

    public static int[] toPrimitive(Integer[] arr) {
        if (arr == null) {
            return null;
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            // автоматическая распаковка из объекта
            result[i] = arr[i];
        }
        return result;
    }
}
