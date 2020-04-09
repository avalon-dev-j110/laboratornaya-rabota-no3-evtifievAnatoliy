package ru.avalon.java.dev.j10.labs.initialization;

import java.util.Arrays;
import ru.avalon.java.dev.j10.labs.Initializer;

/**
 * Инициализатор, выполняющий инициализацию массива
 * значениями последовательности случайных чисел.
 *
 * <p>Экземпляры класса можно использовать многократно для
 * инициализации любого числа массивов.
 *
 * <p>Диапазон, в пределах которого будут получены случайные
 * значения, передаётся в конструктор класса при
 * инициализации.
 */
public class RandomInitializer implements Initializer {

    /**
     * Выполняет инициализацию массива, значениями
     * последовательности случайных чисел.
     *
     * @param array массив, подлежащий инициализации
     */
    private int min;
    private int max;
    private int[] array;

    public RandomInitializer(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void initialize(int[] array) {
        /*
         * TODO(Студент): Реализовать метод initialize класса RandomInitializer
         */
        this.array = array;
        for (int i=0; i< array.length; i++)
            this.array[i] = (int)(Math.random()*((max-min)+1))+min;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.array);
    }
    
   
}
