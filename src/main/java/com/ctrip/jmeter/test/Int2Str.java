package com.ctrip.jmeter.test;

/**
 * Integer.decode()和 Integer.valueof()
 */
public class Int2Str {

    public static void main(String[] args) {
        String str = "10";
        String str2 = "1010";
        int i = Integer.decode(str);
        int s10 = Integer.parseInt(str, 10);
        int s8 = Integer.parseInt(str, 8);
        int s16 = Integer.parseInt(str2, 16);
        int s2 = Integer.parseInt(str2, 2);
        int a = Integer.valueOf(str);
        System.out.println("Integer.decode:" + i);
        System.out.println("Integer.valueOf:" + a);
        System.out.println("Integer.parseInt 10进制:" + s10);
        System.out.println("Integer.parseInt 8进制:" + s8);
        System.out.println("Integer.parseInt 2进制:" + s2);
        System.out.println("Integer.parseInt 16进制:" + s16);
    }
}
