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

    static int occurrence2(String str, String word) {
        int count = 0;
        int index = str.indexOf(word);

        while (index != -1) {
            count++;
            index = str.indexOf(word, index + 1);
        }

        return count;
    }

class WordSearching2{
public static void main(String [] args){
String sentence="Hello planet earth, you are a great planet.";
String s[] = sentence.split(" ");
String word="planet";
int count=0;
for(int i=0;i<s.length;i++){

if(s[i].indexOf(word)!=-1){
count++;
}
}
System.out.println(count);
}
}

