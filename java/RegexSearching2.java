import java.util.regex.Matcher;
import java.util.regex.Pattern;
class RegexSearching2{
public static void main(String [] args){
String str= "hello world";
String regex="\\bworld\\b";
Pattern pattren= Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
Matcher matcher= pattren.matcher(str);
while(matcher.find()){
System.out.print("Start index: " + matcher.start());
System.out.print(" End index: " + matcher.end() + " ");
System.out.println(matcher.group());
}
}
}
