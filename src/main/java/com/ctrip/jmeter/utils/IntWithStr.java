package com.ctrip.jmeter.utils;

public class IntWithStr {

    // TODO: 2018/8/31
    public static int str2int(String str, int radix){
        System.out.println("传入数据:" + str + "进制:" + radix);
        return Integer.parseInt(str, radix);
    }
    public static int str2int(String str){
        return Integer.decode(str);
    }
}
