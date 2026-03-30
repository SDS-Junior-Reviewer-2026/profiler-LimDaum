package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

interface SortServiceLib {
    public void sort(ArrayList<Integer> arr);
    public int getChangeCnt();
}

//abstract class SortServiceLib implements SortServiceLibrary {
//    private int changeCnt = 0;
//    public void addChangeCnt() {
//        changeCnt++;
//    }
//    public int getChangeCnt() {
//        return changeCnt;
//    }
//}

class SelectionSort implements SortServiceLib {
    private int changeCnt = 0;

    // selection sort 오름차순 예시코드
    public void sort(ArrayList<Integer> arr) {
        int tmp_min_idx;
        for (int i = 0; i < arr.size(); i++) {
            tmp_min_idx = i;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(tmp_min_idx) > arr.get(j)) {
                    tmp_min_idx = j;
                }
            }
            if (tmp_min_idx != i) {
                changeCnt++;
                Collections.swap(arr, i, tmp_min_idx);
            }
        }
    }

    public int getChangeCnt() {
        return changeCnt;
    }

}

class BubbleSort implements SortServiceLib {
    private int changeCnt = 0;

    // selection sort 오름차순 예시코드
    public void sort(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size()-i-1; j++) {
                if (arr.get(j) > arr.get(j+1)) {
                    changeCnt++;
                    Collections.swap(arr, j, j+1);
                }
            }
        }
    }

    public int getChangeCnt() {
        return changeCnt;
    }
}