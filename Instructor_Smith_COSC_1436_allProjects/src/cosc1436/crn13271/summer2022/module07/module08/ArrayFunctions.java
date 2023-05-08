package cosc1436.crn13271.summer2022.module07.module08;

import java.util.Arrays;

public class ArrayFunctions {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 6, 7, 9};
        int[] addedElements = addElements(5, arr);
        int[] removedElements = removeElement(6, arr);
        printArrayElements(addedElements, "Array with added element : ");
        printArrayElements(removedElements, "Array with removed element : ");
    }

    static void printArrayElements(int[] arr, String message) {
        System.out.println(message);
        for (int elem : arr) {
            System.out.print(elem + ", ");
        }
        System.out.println("");
    }

    //dynamically adds an element to the end of an array
    static int[] addElements(int val, int[] prevArray) {
        int[] newArray = new int[prevArray.length + 1];
        System.arraycopy(prevArray, 0, newArray, 0, prevArray.length);
        newArray[prevArray.length] = val;
        return newArray;
    }

    //Removes first occurring element from any position in an array
    static int[] removeElement(int val, int[] prevArray) {
        int index = findIndex(prevArray, val);
        if (index == -1) return prevArray;
        int[] newArray = new int[prevArray.length - 1];
        System.arraycopy(prevArray, 0, newArray, 0, index);
        System.arraycopy(prevArray, index + 1, newArray, index, prevArray.length - index - 1);
        return newArray;
    }

    //finds index number of an element
    public static int findIndex(int arr[], int t) {

        if (arr == null) {
            return -1;
        }

        int len = arr.length;
        int i = 0;

        while (i < len) {
            if (arr[i] == t) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }
}
