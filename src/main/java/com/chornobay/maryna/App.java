package com.chornobay.maryna;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Array mas = new Array(6);
        mas.add(42);
        mas.add(-42);
        mas.add(15);
        mas.add(0);
        mas.add(-6);
        mas.add(-87);
        System.out.println("Initial array:");
        mas.printer();
    }
}
