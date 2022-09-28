package com.hellocorp.test.subject;

/**
 * 单向链表倒序输出
 * 跑通测试Subject4Test
 */
public class Subject4 {

    public static class Node {
        Integer value;
        Node next;
    }

    public static Node fromString(String nums) {
        // TODO 根据传入的字符串，构建出来链表
        return new Node();
    }

    public static String toString(Node node) {
        // TODO 将链表输出为字符串
        return "1, 2, 3, 4";
    }

    public void reverse(Node node) {
        // TODO 实现链表倒序
    }

}