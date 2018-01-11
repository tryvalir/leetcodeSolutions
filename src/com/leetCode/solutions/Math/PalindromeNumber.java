package com.leetCode.solutions.Math;

/**
 * @author:xudajan
 * @date:2018/1/11
 *Determine whether an integer is a palindrome. Do this without extra space.
 *这里要保证space complexity为O(1),就不能转换为string数组再搞，所以直接就用上了算法
 *
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0||x%10==0&&x!=0){
            return false;
        }
        int reversedInteger=0;
        while(x>reversedInteger){
            reversedInteger=reversedInteger*10+x%10;
            x=x/10;
        }
        if(reversedInteger==x||reversedInteger/10==x){
            return true;
        }
        return false;
    }
}
