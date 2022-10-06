public class Main {
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int j = low;

        for (int i = low; i < high; i++) {
            if (array[i] <= pivot) {
                swap(array, i, j);
                j++;
            }
        }

        swap(array, j, high);

        return j;
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] array = {9, -3, 5, 2, 6, 8, -6, 1, 3 };

        quickSort(array, 0, array.length - 1);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}