package start;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Maksim_Palchevskii on 9/16/2015.
 */
public class SortingLSD {

    public static void main(String[] args) {
        int r[];
        r = new int[10];
        int i;
        Random rand = new Random();

        for (i = 0; i < 9; i++) {
            r[i] = rand.nextInt(500);
        }
        System.out.println("Input array: " + Arrays.toString(r));
        int[] newarray = sort(r);
        System.out.println("Sorted array: " + Arrays.toString(newarray));
    }

    /**
     * @param inputArray input array will be sorted
     *
     * @return new sorted array
     */
    private static int[] sort(int[] inputArray) {
        for (int shift = Integer.SIZE - 1; shift > -1; shift--) {
            int[] tempArray = new int[inputArray.length];
            int j = 0;
            for (int i = 0; i < inputArray.length; i++) {
                boolean move = inputArray[i] << shift >= 0;
                if (shift == 0 ? !move : move) {
                    tempArray[j] = inputArray[i];
                    j++;
                } else {
                    inputArray[i - j] = inputArray[i];
                }
            }
            for (int i = j; i < tempArray.length; i++) {
                tempArray[i] = inputArray[i - j];
            }
            inputArray = tempArray;
        }
        return inputArray;
    }
}

