package com.leetCode.solutions.Math;

import static java.lang.String.*;

/**
 * @author:xudajan
 * @date:2018/1/5
 * Given a 32-bit signed integer, reverse digits of an integer.
 */
public class ReverseInteger {
    public int reverse(int x) {
        String reversedString="";
//         注意：java的运算符的正确使用，高级算数的Math类的使用
        if(x>=Math.pow(2,31)||x<-(Math.pow(2,31))){
            return 0;
        }
// 注意：valueOf的驼峰结构
        String[] stringArray=String.valueOf(x).split("");
        for(int i=stringArray.length-1;i>=0;i--){

            reversedString=reversedString+stringArray[i];
        }
        if(x<0){
//             注意：substring没有驼峰结构
//             注意：这里String不会变化，str.methodxx不会改变str本身！！！
            reversedString=reversedString.substring(0,reversedString.length()-1);
            reversedString="-"+reversedString;
        }
        long l = Long.parseLong(reversedString);
//         注意：这里返回值可能会大于32bit,所以垃圾考虑不周
        if(l>=Math.pow(2,31)||l<-(Math.pow(2,31))){
            return 0;
        }

        return (int)l;
    }
}
