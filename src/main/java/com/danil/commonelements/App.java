package com.danil.commonelements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
// import java.util.TreeSet;

public class App {
    private static Collection<Integer> common(Collection<Integer> a, Collection<Integer> b) {
        // TreeSet<Integer> result = new TreeSet<>(a);
        List<Integer> result = new ArrayList<>(a);
        result.retainAll(b);
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(6, 4, 6, 8, 1, 100, -100));
        List<Integer> b = new ArrayList<>(Arrays.asList(3, 8, 76544, -42, 100, 1));
        Collection<Integer> result = common(a, b);
        System.out.println(result);
    }
}
