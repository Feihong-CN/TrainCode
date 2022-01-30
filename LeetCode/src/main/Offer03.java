package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Offer03 {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> integers = new HashSet<>();
        for (int num : nums) {
            if (integers.contains(num))
                return num;
            else
                integers.add(num);
        }
        return -1;
    }
}
