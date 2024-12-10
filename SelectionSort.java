public class SelectionSort<T extends Comparable<T>> {
    
    private void selectionSort(T[] array){
        int n = array.length;
        for(int i = 0; i < n - 1; i++){
            int minIndex = i;

            for(int j = i + i; j < n; j++){
                if(array[j].compareTo(array[minIndex]) < 0){
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }

    private void swap(T[] array, int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
