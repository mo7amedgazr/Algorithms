public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {31, 41, 59, 26, 41, 58};
        System.out.println("Ascending Ordering");
        orderAscending(arr);
        System.out.println("Descending Ordering");
        orderDescending(arr);
    }

    private static void orderDescending(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;
            while (i > -1 && arr[i] < key) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = key;

            printArr(arr);
            System.out.println();
        }
    }

    private static void orderAscending(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;
            while (i > -1 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = key;

            printArr(arr);
            System.out.println();
        }
    }

    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
