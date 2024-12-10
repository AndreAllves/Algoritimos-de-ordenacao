public class QuickSort<T extends Comparable<T>> {
    private void sort(T[] array, int leftIndex, int rightIndex){
        if(leftIndex < rightIndex){
            int indexPivot = partition(array, leftIndex, rightIndex);
            sort(array, leftIndex, indexPivot-1);
            sort(array, indexPivot+1, rightIndex);
        }
    }

    private int partition(T[] array, int leftIndex, int rightIndex){
        T pivot = array[rightIndex];
        int i = leftIndex - 1;

        for(int j = leftIndex; j < rightIndex; j++){
            if(array[j].compareTo(pivot) < 0){
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i+1, rightIndex);
        return i + 1;
    }

    private void swap(T[] array, int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    } 
}
