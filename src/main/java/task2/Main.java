package task2;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {3, 2, 2, 3};
        int val = 3;

        System.out.println(val);
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

        System.out.println("");

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == val) {
                for (int j = i; j < myArray.length - 1; j++) {
                    myArray[j] = myArray[j + 1];
                }
                myArray[myArray.length - 1] = val;
            }
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }

}
