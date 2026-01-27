package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Hash_Practice {
    //Contains Duplicate
    public boolean containsDuplicate(int[] nums) {

//        Time: O(n) (because HashSet add/contains is O(1) average)
//        Space: O(n) (worst case all elements unique)

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Hash_Practice p = new Hash_Practice();
        System.out.println(p.containsDuplicate(new int[]{1,9,3,4,5,6,7,8,9}));
    }
}
