package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

/**
 * Сортировка Шелла (англ. Shell sort).
 *
 * <p>Алгоритм сортировки, являющийся усовершенствованным
 * вариантом сортировки вставками. Идея метода Шелла состоит
 * в сравнении элементов, стоящих не только рядом, но и на
 * определённом расстоянии друг от друга. Иными словами —
 * это сортировка вставками с предварительными «грубыми»
 * проходами. Аналогичный метод усовершенствования
 * пузырьковой сортировки называется сортировка расчёской.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%A8%D0%B5%D0%BB%D0%BB%D0%B0">Сортировка Шелла</a>
 */
public class ShellSort implements Sort {

    /**
     * {@inheritDoc}
     */
    private long timeStart = 0;
    private long timeEnd = 0;

    public ShellSort() {
    }
    
    
    
    public void sort(int[] array) {
        /*
         * TODO(Студент): Реализовать метод sort класса ShellSort
         */
        timeStart = System.currentTimeMillis();
        
        int halfIndex = array.length / 2;
        while (halfIndex >= 1) {
            for (int i = 0; i < array.length; i++) 
                for (int j = i - halfIndex; j >= 0; j -= halfIndex) 
                    if (array[j] > array[j + halfIndex]) {
                        int temp = array[j];
                        array[j] = array[j + halfIndex];
                        array[j + halfIndex] = temp;
                    }
        halfIndex = halfIndex / 2;
        }
        
        
        
        
        /*
        for (int i=0; i<array.length; i++){
            int minIndex = i;
            for(int j=i; j<array.length; j++)
                if(array[minIndex]>array[j])
                    minIndex = j;
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }*/
        timeEnd = System.currentTimeMillis();
    }
    public long timeSpent() {
        return timeEnd - timeStart;
    }
}
