package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int element = 0; element < data.length; element++) {
            int min = MinDiapason.findMin(data, element, data.length - 1);
            int index = FindLoop.indexInRange(data, min, element, data.length - 1);
            SwitchArray.swap(data, element, index);
        }
        return data;
    }
}