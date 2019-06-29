package com.sda.exercises.sort;

import java.util.List;

public class BubbleSort {

    public List<Integer> sort(List<Integer> unsortedList) {
        for (int i = 1; i < unsortedList.size(); i++) {
            if (unsortedList.get(i-1) > unsortedList.get(i)) {
                Integer temp = unsortedList.get(i-1);
                unsortedList.set(i-1, unsortedList.get(i));
                unsortedList.set(i, temp);
                i = 0;
            }
        }
        return unsortedList;
    }
}
