package com.practice;

public class Student extends Person{
	private int[] testScores;

    Student(String firstName, String lastName, int id, int[] arr){
       super(firstName,lastName,id);
        testScores = arr;
    }

    public char calculate(){
        int total = 0;
        for(int i=0;i<this.testScores.length;i++){
            total = total + this.testScores[i];
        }
        int average = total/this.testScores.length ;
        if(average>=90 && average<=100) return 'O';
        if(average>=80 && average<90) return 'E';
        if(average>=70 && average<80) return 'A';
        if(average>=55 && average<70) return 'P';
        if(average>=40 && average<55) return 'D';
        if(average<70) return 'T';
        return ' ';
    }

}
