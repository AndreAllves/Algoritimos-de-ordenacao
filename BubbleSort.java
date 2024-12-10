public class BubbleSort<T extends Comparable<T>> {
    private void bubbleSort(T[] array){
        boolean swapped = true;
        int n = array.length;
        while (swapped) {
            swapped = false;
            for(int i = 0; i < n - 1; i++){
                if(array[i].compareTo(array[i+1]) > 0){
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }
            n--;
        }
    }

    private void swap(T [] array, int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
