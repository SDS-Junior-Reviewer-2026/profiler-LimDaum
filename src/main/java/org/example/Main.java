package org.example;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // TODO : Profiler 실행해보기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Profiler p = new Profiler();

        String tmp_input = br.readLine();

        while (!tmp_input.equals("exit")) {
            p.setData(new ArrayList<>(Arrays.asList(5,2,1,3,1,2,6,9)));
            p.setLib(tmp_input);
            p.runLib();
            p.showResult();
            System.out.println("------------------------------");
            tmp_input = br.readLine();
        }
    }
}