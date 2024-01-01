import java.util.Arrays;
public class SearchMinMax {
    public static void main(String[] args) {
        int[] array = new int[500000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }

        long startTime = System.nanoTime();
        int[] minMaxValues = findMinMaxValues(array);
        long endTime = System.nanoTime();

        System.out.println("Minimum value: " + minMaxValues[0]);
        System.out.println("Maximum value: " + minMaxValues[1]);

        long searchTime = endTime - startTime;
        System.out.println("Linear Search time: " + searchTime + " nanoseconds");


        int randomKey = (int) (Math.random() * 10000);
        startTime = System.nanoTime();
        int binarySearchResult = binarySearch(array, randomKey);
        endTime = System.nanoTime();

        System.out.println("\nBinary Search with Random Key: " + randomKey);
        if (binarySearchResult != -1) {
            System.out.println("Key found at index: " + binarySearchResult);
        } else {
            System.out.println("Key not found in the array");
        }

        searchTime = endTime - startTime;
        System.out.println("Binary Search time: " + searchTime + " nanoseconds");
    }

    private static int[] findMinMaxValues(int[] array) {
        int minValue = array[0];
        int maxValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            } else if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        return new int[]{minValue, maxValue};
    }

    private static int binarySearch(int[] array, int key) {
        Arrays.sort(array);

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == key) {
                return mid; 
            } else if (array[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; 
    }
}




