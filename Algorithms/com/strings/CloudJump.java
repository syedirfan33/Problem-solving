package com.strings;

import java.util.Scanner;

public class CloudJump {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] clouds = new int[size];
        for (int i = 0; i < size; i++) {
            clouds[i] = sc.nextInt();
           
            size--;
        }

        sc.close();
        System.out.println(findJumps(clouds));
    }

    private static int findJumps(int[] arr) {
        int jumps = 0;
        int i=0;
        while(i!=arr.length-1){
            if(i!=arr.length-2 && arr[i+2]==0)
                i+=2;
            else
                i++;
            jumps++;
        }
        return jumps;
    }
   
}