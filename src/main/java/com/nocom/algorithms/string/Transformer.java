package com.nocom.algorithms.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fraj on 7/3/16 at 1:16 AM.
 */
public class Transformer {
    public static List getPermutations(String query) {
        char[] queryArr = query.toCharArray();
        List<String> permutations = new ArrayList<>();
        int ind = 0, len = queryArr.length - 1;
        permute(permutations, queryArr, ind, len);
        return permutations;
    }

    private static void permute(List<String> permutations, char[] query, int ind, int len) {
        if (ind == len) {
            permutations.add(new String(query));
        }
        for (int i = ind; i <= len; ++i) {
            swap(query, i, ind);
            permute(permutations, query, ind + 1, len);
            swap(query, i, ind);
        }
    }

    private static void swap(char[] query, int i, int j) {
        if (i != j) {
            char tmp = query[i];
            query[i] = query[j];
            query[j] = tmp;
        }
    }

    public static void main(String[] args) {
        String query = "ABCDE";
        List<String> permutations = getPermutations(query);
        System.out.printf("# Permutations of %s: %d%n", query, permutations.size());
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }
}
