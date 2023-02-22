package sem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка. */

public class dz3 {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = getRandomArray(10, 1, 40);
        int maxValue = Collections.max(numbers);
        int minValue = Collections.min(numbers);
        double averageValue = getAverageValue(numbers);
        System.out.printf("Список: %s\n", numbers.toString());
        System.out.printf("Максимальное значение в списке: %d\nМинимальное значение списка: %d\n" +
                "Среднее арифмитеческое элементов списка: %.2f", maxValue, minValue, averageValue);
    }
    
    public static ArrayList getRandomArray(int size, int min, int max){
        ArrayList arr = new ArrayList(); 
        Random rand = new Random();
        for (int i = 0; i < size; i++) { 
            arr.add(rand.nextInt(min, max));
            } 
            return arr; 
        }
    
    public static Double getAverageValue (ArrayList<Integer> list) {
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        double averageValue = (double) sum / list.size();
        return averageValue;
    }
}
