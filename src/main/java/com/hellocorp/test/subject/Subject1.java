package com.hellocorp.test.subject;

/**
 * 设计一个函数，计算一个数组，如[8, 2, 3, 1, 4, 7, 3, ...]内，连续n个数的和的最大值
 * 跑通测试Subject1Test
 */
public class Subject1 {

    public int maxSum(String nums, int n) {
        // TODO 拆分字符串为数字数组
        String sp[] = nums.split(",");
        int sum = 0, mSum = 0;
        for (int i = 0; i < n; i++) {
            sum += Integer.valueOf(sp[i].trim());
        }
        // TODO 求连续最大和
        mSum = sum;
        for (int i = n; i < sp.length; i++) {
            sum -= Integer.valueOf(sp[i - n].trim());
            sum += Integer.valueOf(sp[i].trim());
            if (sum > mSum) {
                mSum = sum;
            }
        }
        return mSum;
    }

}
