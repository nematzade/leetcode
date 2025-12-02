package com.api;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        return dfs(root, false);
    }

    private int dfs(TreeNode node, boolean flag) {
        if (node == null) return 0;

        if (flag && node.left == null && node.right == null) {
            return node.val;
        }

        return dfs(node.left , true) + dfs(node.right, false);
    }


    private static int countNegatives(List<List<Integer>> list) {
        int counter = 0;
        int size = list.size()-1;

        for (List<Integer> row : list) {
            int firstNegative = list.size();
            int left = 0;
            int right = size-1;

            while(left <= right) {
                int mid = (left + right)/2;

                if (row.get(mid) < 0) {
                    firstNegative = mid;
                    right = mid-1;
                } else {
                    left = mid+1;
                }
            }

            counter += size - firstNegative;
        }

        return counter;
    }


    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while(left <= right) {
            int mid = (left + right)/2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] > target) {
                right = mid-1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
