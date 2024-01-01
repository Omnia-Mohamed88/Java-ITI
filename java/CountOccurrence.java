import java.io.*;

class CountOccurrence {
    static int countOccurrence(String str, String word) {
        String[] a = str.split(" ");
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (word.equals(a[i])) {
                count++;
            }
        }

        return count;
    }

public static void main(String[] args) {
        String str = "hello hi from iti hello";
        String word = "hello";  
        System.out.println(countOccurrence(str, word));  
    }
}

