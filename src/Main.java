import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String pattern="^[A-Z]{1,}.*.$";
        String valid="A sentence that starts with capital letter and ends with period.";
        String invalid="a sentene that doesnot start with capital letter and ends with period.";
        String invalidAsWell="a sentene that doesnot start with capital letter and does not ends with period";
        Pattern pattern1=Pattern.compile(pattern);
        Matcher matcher=pattern1.matcher(valid);
        printStatus(matcher);
        matcher=pattern1.matcher(invalid);
        printStatus(matcher);
        matcher=pattern1.matcher(invalidAsWell);
        printStatus(matcher);
    }
    static void printStatus(Matcher matcher){
        if(matcher.matches())
            System.out.println("string has matched");
        else
            System.out.println("string did not match");
    }
}
