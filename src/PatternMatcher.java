import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    static final String PATTERN="^[A-Z]{1,}.*\\.$";
    static final Logger LOGGER = Logger.getLogger(PatternMatcher.class.getName());

    public static void main(String[] args) {
        String valid="A sentence that starts with capital letter and ends with period.";
        String invalid="a sentene that doesnot start with capital letter and ends with period.";
        String invalidAsWell="a sentene that doesnot start with capital letter and does not ends with period";
        String invalidAsUsual="A sentene that does start with capital letter and does not ends with period";
        isValidSentence(valid);
        isValidSentence(invalid);
        isValidSentence(invalidAsWell);
        isValidSentence(invalidAsUsual);
    }

    static void isValidSentence(String sentence){
        if(patternMatchHandler(sentence))
            LOGGER.info("sentence has matched");
        else
            LOGGER.info("sentence did not match");
    }

    static boolean patternMatchHandler(String sentence){
        Pattern pattern1=Pattern.compile(PATTERN);
        Matcher matcher=pattern1.matcher(sentence);
        return matcher.matches();
    }

}
