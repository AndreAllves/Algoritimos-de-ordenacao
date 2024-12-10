public class SelectionSortRecursivo<T extends Comparable<T>> {

    public void sort(T[] array, int inicio) {
        if (inicio < array.length - 1) {
            int minIndex = encontraMenorIndex(array, inicio, array.length - 1);
            swap(array, inicio, minIndex);
            sort(array, inicio + 1);
        }
    }

    private int encontraMenorIndex(T[] array, int iniIndex, int finIndex) {
        int minIndex = iniIndex;
        for (int i = iniIndex + 1; i <= finIndex; i++) {
            if (array[i].compareTo(array[minIndex]) < 0) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}