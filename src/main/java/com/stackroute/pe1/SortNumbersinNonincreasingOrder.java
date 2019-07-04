package com.stackroute.pe1;


public class SortNumbersinNonincreasingOrder {

    public String numberSorting(int number) {
        if (number <= 0) {
            return "Error";
        } else {
            //sort the number in non-decreasing order
            int array[] = new int[20];
            int count = 0;
            while (number > 0) {
                array[count] = number % 10;
                count = count + 1;
                number = number / 10;

            }
            int temp = 0;
            for (int i = 0; i < count; i++) {
                for (int j = i + 1; j < count; j++) {
                    if (array[i] < array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            int result = 0;
            for (int i = 0; i < count; i++) {
                result = (result * 10) + array[i];
            }
   //to find sum of array
            int sum = 0;
            for (int i = 0; i < count; i++) {
                if (array[i] % 2 == 0) {
                    sum = sum + array[i];
                }
            }

            if (sum > 15) {
                return "True";
            } else {
                return "False";
            }
        }
    }
}