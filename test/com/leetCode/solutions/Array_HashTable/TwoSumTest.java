package com.leetCode.solutions.Array_HashTable;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by 56848 on 2018/1/11.
 */
public class TwoSumTest {
    @Test
    public void twoSum() throws Exception {
        int[] array1=new TwoSum().twoSum(new int[]{2, 7, 11, 15},9);
//        输出数组内容的方式
        System.out.println(Arrays.toString(array1));
    }

}