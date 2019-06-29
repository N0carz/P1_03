package com.sda.exercises;

import java.util.List;

public class InsertSort {
    public List<Integer> sort(List<Integer> unsortedList) {
        for (int i = 1; i < unsortedList.size(); i++) {
            Integer key = unsortedList.get(i);
            int j = i - 1;

            while (j >= 0 && unsortedList.get(j) > key) {
                unsortedList.set(j + 1, unsortedList.get(j));
                j -= 1;
            }
            unsortedList.set(j + 1, key);
        }
        return unsortedList;
    }
}
