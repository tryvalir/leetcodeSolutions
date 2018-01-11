package com.leetCode.solutions.Math;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 56848 on 2018/1/11.
 */
public class ReverseIntegerTest {
    @Test
    public void reverse() throws Exception {
        System.out.println(new ReverseInteger().reverse(123456789));
        System.out.println(new ReverseInteger().reverse(-123));
    }

}