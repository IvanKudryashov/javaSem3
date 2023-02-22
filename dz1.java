package sem3;

import java.util.Arrays;
import java.util.Random;

/*Реализовать алгоритм сортировки слиянием */

public class dz1 {
    public static void main(String[] args){
        int[] array = getRandomArrayList(30, 30);
        showArray(array, "Исходный массив:");
        mergeSorting(array, 0, array.length - 1);
        showArray(array, "Отсортированный массив:");
    }

    public static void showArray(int[] array, String message){
        System.out.println(message);
        System.out.println(Arrays.toString(array));
    }

    public static int[] getRandomArrayList(int arraySize, int maxRandomValue){
        int[] array = new int[arraySize];
        Random element = new Random();
        for (int i = 0; i < arraySize; i++){
            array[i] = element.nextInt(maxRandomValue);
        }
        return array;
    }

    
    public static void mergeSorting(int[] array, int rightElement, int leftElement) {
    
        if (leftElement <= rightElement) return;

        int middleElement = rightElement + (leftElement - rightElement) / 2;

        mergeSorting(array, rightElement, middleElement);
        mergeSorting(array, middleElement + 1, leftElement);

        int[] buffer = Arrays.copyOf(array, array.length);
        for (int k = rightElement; k <= leftElement; k++) buffer[k] = array[k];

        int i = rightElement;
        int j = middleElement + 1;

        for (int k = rightElement; k <= leftElement; k++) {
            if (i > middleElement) {
                array[k] = buffer[j];
                j++;
            } else if (j > leftElement) {
                array[k] = buffer[i];
                i++;
            } else if (buffer[j] < buffer[i]) {
                array[k] = buffer[j];
                j++;
            } else {
                array[k] = buffer[i];
                i++;
            }
        }
    }
}
