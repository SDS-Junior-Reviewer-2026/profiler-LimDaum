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

    public void sort(ArrayList<Integer> arr) {
        int minIdx;
        for (int i = 0; i < arr.size()-1; i++) {
            minIdx = i;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(minIdx) > arr.get(j)) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                changeCnt++;
                Collections.swap(arr, i, minIdx);
            }
        }
    }

    public int getChangeCnt() {
        return changeCnt;
    }
}

class BubbleSort implements SortServiceLib {
    private int changeCnt = 0;

    public void sort(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            int tmpChangeCnt = changeCnt;
            for (int j = 0; j < arr.size()-i-1; j++) {
                if (arr.get(j) > arr.get(j+1)) {
                    changeCnt++;
                    Collections.swap(arr, j, j+1);
                }
            }
            if  (changeCnt == tmpChangeCnt) {
                break;
            }
        }
    }

    public int getChangeCnt() {
        return changeCnt;
    }
}