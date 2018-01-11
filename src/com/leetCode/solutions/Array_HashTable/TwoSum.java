package com.leetCode.solutions.Array_HashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:xudajan
 * @date:2018/1/11
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
//         original version
        if(null==nums||nums.length<2){
            throw new IllegalArgumentException("Arguments exception");
        }
        //     for(int i=0;i<nums.length-1;i++){
        //         for(int j=i+1;j<nums.length;j++){
        //             if(nums[i]+nums[j]==target){
        //                 return new int[]{i,j};
        //             }
        //         }
        //     }
        //     throw new IllegalArgumentException("no result");
        // }
//         Improved version
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int implement=target-nums[i];
            if(map.containsKey(implement)){
                return new int[]{map.get(implement),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("no result");
    }
}
