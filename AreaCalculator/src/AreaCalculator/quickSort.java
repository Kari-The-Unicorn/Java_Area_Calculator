import java.util.ArrayList;

public class quickSort {
    public static void quickSort (ArrayList<Double> arr,int low, int high){
        if (arr == null || arr.size() == 0)
            return;

        if (low >= high)
            return;

        // pick the pivot
        int middle = low + (high - low) / 2;
        double pivot = arr.get(middle);

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr.get(i) < pivot) {
                i++;
            }

            while (arr.get(j) > pivot) {
                j--;
            }

            if (i <= j) {
                double temp = arr.get(i);
//                    arr.get(i) = arr.get(j);
                arr.set(i, arr.get(j));
//                    arr.get(j) = temp;
                arr.set(j, temp);
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j)
            quickSort(arr, low, j);

        if (high > i)
            quickSort(arr, i, high);
    }
}
