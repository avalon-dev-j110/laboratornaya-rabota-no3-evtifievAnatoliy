package ru.avalon.java.dev.j10.labs;
import ru.avalon.java.dev.j10.labs.initialization.*;
import ru.avalon.java.dev.j10.labs.sort.*;

public class Application {

    public static void main(String[] args) {
        

	/*
	* TODO(Студент): Выполнить действия над массивом чисел
	*
	* 0. Инициализировать переменную array массивом из 20 целых чисел.
	*/
        int[] array = new int[20];
	
        /* 1. Проинициализировать массив значениями
	*    последовательности чисел Фибоначчи.
	*/
        FibonacciInitializer fibonacciArray = new FibonacciInitializer();
        fibonacciArray.initialize(array);
        System.out.println("fibonacciArray : \n" + fibonacciArray.toString());
	     /* 2. Найти сумму элементов массива.
	     */
	System.out.println("Сумма чисел fibonacciArray : " + fibonacciArray.sumArray());
        /* 3. Проинициализировать массив последовательностью
	*    случайных чисел в диапазоне от -50 до 50.
	*/
        RandomInitializer randomArray = new RandomInitializer(-50,50);
        randomArray.initialize(array);
        System.out.println("\nrandomArray : \n" + randomArray.toString());
            
	/* 4. Отсортировать массив с использованием
	*    пузырьковой сортировки.
	*/
        BubbleSort bubbleSortArray = new BubbleSort();
        bubbleSortArray.sort(array);
        System.out.println("randomArray after BubbleSort : \n" + randomArray.toString());
        System.out.println("Time BubbleSort : " + bubbleSortArray.timeSpent()+ " millisec.");
        
        /* 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         */
        randomArray.initialize(array);
        System.out.println("\nrandomArray : \n" + randomArray.toString());
        /* 6. Отсортировать массив с использованием
         *    сортировки выбором.
         */
        SelectionSort selectionSortArray = new SelectionSort();
        selectionSortArray.sort(array);
        System.out.println("randomArray after SelectionSort : \n" + randomArray.toString());
        System.out.println("Time SelectionSort : " + selectionSortArray.timeSpent()+ " millisec.");
        /* 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         */
        randomArray.initialize(array);
        System.out.println("\nrandomArray : \n" + randomArray.toString());
        /* 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
        ShellSort shellSortArray = new ShellSort();
        shellSortArray.sort(array);
        System.out.println("randomArray after ShellSort : \n" + randomArray.toString());
        System.out.println("Time ShellSort : " + shellSortArray.timeSpent()+ " millisec.");
    }
}
