package ru.avalon.java.dev.j10.labs;
import java.util.Arrays;
import ru.avalon.java.dev.j10.labs.initialization.*;
import ru.avalon.java.dev.j10.labs.sort.*;

public class Application {

    public static void main(String[] args) {
        

	/*
	* TODO(Студент): Выполнить действия над массивом чисел
	*
	* 0. Инициализировать переменную array массивом из 20 целых чисел.
	*/
        int[] array = new int[0];
	
        /* 1. Проинициализировать массив значениями
	*    последовательности чисел Фибоначчи.
	*/
        FibonacciInitializer fibonacciArray = new FibonacciInitializer();
        fibonacciArray.initialize(array);
        System.out.println("fibonacciArray : \n" + Arrays.toString(array));
	     /* 2. Найти сумму элементов массива.
	     */
	System.out.println("Сумма чисел fibonacciArray : " + sumArray(array));
        /* 3. Проинициализировать массив последовательностью
	*    случайных чисел в диапазоне от -50 до 50.
	*/
        
        RandomInitializer randomArray = new RandomInitializer(-50,50);
        randomArray.initialize(array);
        System.out.println("\nrandomArray : \n" + Arrays.toString(array));
            
	/* 4. Отсортировать массив с использованием
	*    пузырьковой сортировки.
	*/
        BubbleSort bubbleSortArray = new BubbleSort();
        bubbleSortArray.sort(array);
        System.out.println("randomArray after BubbleSort : \n" + Arrays.toString(array));
        System.out.println("Time BubbleSort : " + bubbleSortArray.timeSpent()+ " millisec.");
        
        /* 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         */
        randomArray.initialize(array);
        System.out.println("\nrandomArray : \n" + Arrays.toString(array));
        /* 6. Отсортировать массив с использованием
         *    сортировки выбором.
         */
        SelectionSort selectionSortArray = new SelectionSort();
        selectionSortArray.sort(array);
        System.out.println("randomArray after SelectionSort : \n" + Arrays.toString(array));
        System.out.println("Time SelectionSort : " + selectionSortArray.timeSpent()+ " millisec.");
        /* 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         */
        randomArray.initialize(array);
        System.out.println("\nrandomArray : \n" + Arrays.toString(array));
        /* 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
        ShellSort shellSortArray = new ShellSort();
        shellSortArray.sort(array);
        System.out.println("randomArray after ShellSort : \n" + Arrays.toString(array));
        System.out.println("Time ShellSort : " + shellSortArray.timeSpent()+ " millisec.");
    }
    
    public static int sumArray(int[] array){
        int sum = 0;
        for (int i=0; i< array.length; i++)
            sum = sum + array[i];

        return sum;
    }
}
