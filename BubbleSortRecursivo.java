import java.lang.reflect.Array;

public class BubbleSortRecursivo<T extends Comparable<T>> {
   public void sort(T[] array) {
    bubbleSort(array, array.length - 1, 0);
    }

    private void bubbleSort(T[] array, int right, int left) {
        if (right < 1) {
            return;
        }

        if (left < right) {
            if (array[left].compareTo(array[left + 1]) > 0) {
                swap(array, left, left + 1);
            }
            bubbleSort(array, right, left + 1);
        } 
        bubbleSort(array, right - 1, 0);
    }

    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

