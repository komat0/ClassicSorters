public class SelectionSorter {

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int pos = i;
            int min = array[i];
            // smallest element loop
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;    // pos - index of smallest element
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;    // change with the smallest element array[i]
        }
    }
}