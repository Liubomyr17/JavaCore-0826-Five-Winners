package com.company;

/*
0826 Five Winners
Create an array of 20 numbers.
Fill it with numbers from the keyboard.
Print the five largest numbers.
Each value from a new line.

Requirements:
1. The program should display the numbers on the screen.
2. The program should read the values from the keyboard.
3. The Solution class must contain two methods.
4. The sort () method should sort the array of numbers from larger to smaller.
5. The main () method should call the sort () method.
6. The program should output the five largest numbers in the array. Each value from a new line.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j]>array[i]) {
                    int m = array[i];
                    array[i] = array[j];
                    array[j] = m;
                }

            }
        }
    }
}




