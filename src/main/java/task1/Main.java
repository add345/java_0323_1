package task1;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        int[] myArray = new int[5];
        int min, max;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = ThreadLocalRandom.current().nextInt(-11, 11);
            System.out.print(myArray[i] + " ");
        }

        System.out.println("");
        max = 0;
        min = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < myArray[min]) {
                min = i;
            }
            if (myArray[i] > myArray[max]) {
                max = i;
            }
        }

        System.out.println("min: " + myArray[min] + " max: " + myArray[max]);
    }

}
