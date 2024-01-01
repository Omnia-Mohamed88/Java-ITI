import java.util.StringTokenizer;
class TokenizerSearch{
public static void main(String [] args){

String sentence="Hello planet earth, you are a great planet";
String word="planet";
int count=0;
StringTokenizer str= new StringTokenizer(sentence);
while(str.hasMoreTokens()){
String token =str.nextToken();
if(token.equals(word)){
count++;
}
}
System.out.println(count);
}
}

