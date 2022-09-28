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
        Node dummy = new Node();
        Node cur = dummy;
        String[] split = nums.split(",");
        for(int i = 0;i < split.length;i++){
            int temp = Integer.valueOf(split[i].trim());
            Node tempNode = new Node();
            tempNode.value = temp;

            cur.next =  tempNode;
            cur = cur.next;
        }
        return dummy.next;
    }

    public static String toString(Node node) {
        // TODO 将链表输出为字符串
        StringBuilder sb = new StringBuilder();
        while(node != null){
            int val = node.value;
            sb.append(String.valueOf(val));
            node = node.next;
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i < sb.length();i++){
            ans.append(sb.charAt(i));
            if(i != sb.length()-1){
                ans.append(", ");
            }
        }
        System.out.println(sb);
        return ans.toString();
    }

    public Node reverse(Node node) {
        // TODO 实现链表倒序
//        Node dummy = new Node();
//        dummy.next = node;
        Node pre = null;
        Node cur = node;

        while(cur != null){
            Node after = cur.next;
            cur.next = pre;
            pre = cur;
            cur = after;
        }
        return pre;
    }

}