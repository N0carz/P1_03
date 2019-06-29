package com.sda.exercises;

import java.util.List;

public class QuickSort {

    public List<Integer> sort(List<Integer> unsortedList) {
        quickSort(unsortedList, 0, unsortedList.size() - 1);
        return unsortedList;
    }

    public void quickSort(List<Integer> unsortedList, Integer left, Integer right) {

        if (left < right) {
            Integer pivot = partition(unsortedList, left, right);
            quickSort(unsortedList, left, pivot - 1);
            quickSort(unsortedList, pivot + 1, right);
        }
    }

    private Integer partition(List<Integer> unsortedList, int left, int right) {

        int pivot = unsortedList.get(right);
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (unsortedList.get(j) <= pivot) {
                i++;

//                swap
                Integer temp = unsortedList.get(i);
                unsortedList.set(i, unsortedList.get(j));
                unsortedList.set(j, temp);
            }
        }
//        swap
        Integer temp = unsortedList.get(i + 1);
        unsortedList.set(i + 1, unsortedList.get(right));
        unsortedList.set(right, temp);
        return i + 1;
    }
}
