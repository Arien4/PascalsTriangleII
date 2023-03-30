package practice;

// Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
// In Pascal's triangle, each number is the sum of the two numbers directly above it.

// Example 1:
// Input: rowIndex = 3
// Output: [1,3,3,1]
// Example 2:
// Input: rowIndex = 0
// Output: [1]
// Example 3:
// Input: rowIndex = 1
// Output: [1,1]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getRow(1).toArray()));
    }
    public static List<Integer> getRow(int rowIndex) {
        // List<Integer> result = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        if (rowIndex <= 0) return prev;
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for (int j = 0; j < prev.size() - 1; j++) {
                curr.add(prev.get(j) + prev.get(j + 1));
            }
            curr.add(1);
            if (i == rowIndex) return curr;
            else prev = curr;
        }
        return null;
    }
}
