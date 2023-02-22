package sem3;

import java.util.ArrayList;
import java.util.Random;

/*Пусть дан произвольный список целых чисел, удалить из него четные числа */

public class dz2 {
    public static void main(String[] args) {
        ArrayList<Integer> array = getRandomArray(10, 1, 20);
        System.out.println(array);
        System.out.println(removeEvenNums(array));
}

public static ArrayList getRandomArray(int size, int min, int max){
    ArrayList arr = new ArrayList(); 
    Random rand = new Random();
    for (int i = 0; i < size; i++) { 
        arr.add(rand.nextInt(min, max));
        } 
        return arr; 
    } 

public static ArrayList removeEvenNums(ArrayList<Integer> lis){
    ArrayList <Integer> arr = new ArrayList<>();
    for (int item : lis) {
        if (item % 2 != 0){
            arr.add(item);
        }
    }
    return arr;
}
}
