public class OddEvenSort {

    public static void oddEvenSort(int[] array){
        int n = array.length;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;

            for(int i = 1; i < n - 1; i += 2){
                if(array[i] > array[i + 1]){
                    swap(array, i, i + 1);
                    sorted = false;
                }
            }

            for(int j = 0; j < array.length; j += 2){
                if(array[j] > array[j +1 ]){
                    swap(array, j, j + 1);
                    sorted = false;
                }
            }
        }
    }

    private static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    } 
}