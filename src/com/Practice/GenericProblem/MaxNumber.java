package com.Practice.GenericProblem;

public class MaxNumber {
    public static void main(String[] args) {
       Integer num1=10;
       Integer num2=20;
       Integer num3=30;
       Integer max=num1;
       if(num2.compareTo(max)>0){
           max=num2;
       }
       if(num3.compareTo(max)>0){
           max=num3;
       }
        System.out.println("Max value is : "+max);
    }
}
