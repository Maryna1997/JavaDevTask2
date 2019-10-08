package com.chornobay.maryna;

/**
 * Created by Марина on 08.10.2019.
 */
public class Array {
    private int[] arr;
    private int counts;


    public Array(int max){
        arr = new int[max];
        counts = 0;
    }

    public void printer(){
        for (int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            System.out.println("");
        }

    }

    public void add(int value){
        arr[counts] = value;
        counts++;
    }
}
