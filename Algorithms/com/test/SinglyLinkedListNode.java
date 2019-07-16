package com.test;

import java.io.BufferedWriter;
import java.io.IOException;

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }
}


class SinglyLinkedListPrintHelper {
    public static void printList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter)
            throws IOException {
        while (node != null) {
           System.out.println(node.data);

            node = node.next;

        }
    }
}

class Result {

    /*
     * Complete the 'mergeInBetween' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST. The
     * function accepts following parameters: 1. INTEGER_SINGLY_LINKED_LIST list1 2.
     * INTEGER_SINGLY_LINKED_LIST list2 3. INTEGER a 4. INTEGER b
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode { int data; SinglyLinkedListNode next; }
     *
     */

    public static SinglyLinkedListNode mergeInBetween(SinglyLinkedListNode list1, SinglyLinkedListNode list2, int a,
            int b) throws IOException {
        // Write your code here
        SinglyLinkedListNode output = null;

            output = list1;
            int b_ori = b;
            SinglyLinkedListNode tail2 = null;
            SinglyLinkedListNode helper = output;
            while (b >= 0) {
                tail2 = helper;
                helper = helper.next;
                b--;
            }
            SinglyLinkedListNode node = list2.next;
            SinglyLinkedListNode tail = list2;
            while(node != null){
                tail = node;
                node = node.next;
            }
            tail.next = tail2;
            int count = a;
            SinglyLinkedListNode head = output;
            while(count>1){
                if(count==2) head.next = list2;
                head = output.next;
                count--;
            }
            int c = b_ori;
            if(a==1){
                SinglyLinkedListNode helper_head = output.next;
               for(int i=0;i<=b_ori;i++){
               
                   if(i==b_ori) head.next = list2;
                   head.next = helper_head.next;
                   helper_head = helper_head.next;
               }
            }
            return output;
       

    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        

        SinglyLinkedList list1 = new SinglyLinkedList();

        list1.insertNode(5);
        list1.insertNode(10);
        list1.insertNode(15);
        list1.insertNode(20);

        SinglyLinkedList list2 = new SinglyLinkedList();

        list2.insertNode(6);
        list2.insertNode(11);
        list2.insertNode(16);

        int a = 1   ;

        int b = 3;

        SinglyLinkedListNode result = Result.mergeInBetween(list1.head, list2.head, a, b);

        SinglyLinkedListPrintHelper.printList(result, "\n", null);
       
    }
}
