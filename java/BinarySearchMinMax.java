import java.util.Arrays;

public class BinarySearchMinMax {
    public static void main(String[] args) {

        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }

        Arrays.sort(array);

        int minValue = array[0];
        int maxValue = array[array.length - 1];


        System.out.println("Minimum value: " + minValue);
        System.out.println("Maximum value: " + maxValue);
    }
}

