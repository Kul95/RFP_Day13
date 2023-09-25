package com.Practice.GenericProblem;

public class PrintMyArray <X,Y,Z>{
    X[] myXArray;
    Y[] myYArray;
    Z[] myZArray;
    public PrintMyArray(X[] myXArray,Y[] myYArray,Z[] myZArray){
        this.myXArray=myXArray;
        this.myYArray=myYArray;
        this.myZArray=myZArray;
    }

    public static void main(String[] args) {
        Integer a[]={1,2,3};
        Double b[]={2.9,8.9,5.7};
        Character ch[]={'A','B','C'};
        toPrint(a);
        toPrint(b);
        toPrint(ch);
        new PrintMyArray<Integer,Double,Character>(a,b,ch).toPrint();
//        new PrintMyArray<Double>(b).toPrint();
//        new PrintMyArray<Character>(ch).toPrint();
    }
    public void toPrint(){
        toPrint(myXArray);
        toPrint(myYArray);
        toPrint(myZArray);
    }
    public static <E> void toPrint(E[] a){
        for(E i:a){
            System.out.print(i+" ");
        }
    }
}
