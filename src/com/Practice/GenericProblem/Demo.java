package com.Practice.GenericProblem;
import java.util.Arrays;
public class Demo {
    public void DivideBySevenAndFive(){
        int arr[]={15,10,21,35,42,8,17};
        int five[]=new int[arr.length];
        int seven[]=new int[arr.length];
        int countFive=0;
        int countSeven=0;
        for(int num:arr){
            if(num%5==0){
                five[countFive++]=num;
            }else if(num%7==0){
                seven[countSeven++]=num;
            }
        }
        five= Arrays.copyOf(five,countFive);
        seven= Arrays.copyOf(seven,countSeven);
        System.out.println("Array divide by Five: ");
        for (int num:five){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Array divide by Seven: ");
        for (int num:seven){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        Demo d=new Demo();
        d.DivideBySevenAndFive();
}}
