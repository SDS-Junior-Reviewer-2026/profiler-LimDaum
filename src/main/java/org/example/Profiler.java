package org.example;

import java.util.ArrayList;

public class Profiler {
    // TODO : Profiler 구현
    private ArrayList<Integer> arr;
    private SortServiceLib sortServiceLib;

    void setData(ArrayList<Integer> arr) {
        this.arr = arr;
    }

    void setLib(String type) {
        if (type.equals("selection")) {
            sortServiceLib = new SelectionSort();
        }
        else if (type.equals("bubble")) {
            sortServiceLib = new BubbleSort();
        }
        else sortServiceLib = null;
    }

    void runLib() {
        sortServiceLib.sort(arr);
    }

    void showResult() {
        System.out.print("정렬결과: ");
        System.out.println(arr);
        System.out.printf("swap 횟수: %d\n", sortServiceLib.getChangeCnt());
    }
}
