public class InsertionSortRecusivo<T extends Comparable<T>> {
    private void insertionSort(T[] array, int left, int right){
        if(left >= 0 && array[left].compareTo(array[left + 1]) > 0){
            swap(array, left, left + 1);
            insertionSort(array, left - 1, right);
        }  
    }

    private void sort(T[] array, int left, int right){
        if(left < right){
            sort(array, left, right - 1);
            insertionSort(array, right, right);
        }    
    }

    private void swap(T[] array, int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
