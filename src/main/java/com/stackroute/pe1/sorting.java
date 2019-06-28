package com.stackroute.pe1;


public class sorting {

    public String NumberSorting(int number) {
        if (number <= 0) {
            return "Error";
        } else {
            //sort the number in non-decreasing order
            int arr[] = new int[20];
            int count = 0;
            while (number > 0) {
                arr[count] = number % 10;
                count = count + 1;
                number = number / 10;

            }
            int temp = 0;
            for (int i = 0; i < count; i++) {
                for (int j = i + 1; j < count; j++) {
                    if (arr[i] < arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            int res = 0;
            for (int i = 0; i < count; i++) {
                res = (res * 10) + arr[i];
            }
            //System.out.println("Sorted number in non-increasing order : "+res);
            int sum = 0;
            for (int i = 0; i < count; i++) {
                if (arr[i] % 2 == 0) {
                    sum = sum + arr[i];
                }
            }

            //System.out.println("Sum of even numbers : "+sum);
            if (sum > 15) {
                return "True";
            } else {
                return "False";
            }
        }
    }
}