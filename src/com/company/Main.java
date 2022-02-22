package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Set<Integer> set = new HashSet();


        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) > 0 && (intList.get(i) % 2) == 0 ) {
                set.add(intList.get(i));
            }
        }

        System.out.println(set);



    }
}
