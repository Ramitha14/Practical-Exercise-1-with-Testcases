package com.stackroute.pe1;

public class SumofValue{
    public int sumofNumbers(int arr[]) {
        int sum = 0;
        //sum of elements
        for (int input : arr) {
            sum = sum + input;
        }
        return sum;
    }
}