package com.rizal.mekaritest.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author Glasnost Team on 14/04/22.
 */
public class Util {

    public ArrayList<Integer> getRandomIndex(int totalIndex) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < totalIndex; i++) {
            Random random = new Random();
            result.add(random.nextInt(12 - 1 + 1) + 1);
        }
        Collections.sort(result);
        System.out.println(result);
        return result;
    }
}
