import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static final String REGEX_PHONE_NUMBER = "^\\(\\d{2}\\)\\-\\(0\\d{9}\\)$";
    public boolean validatePhoneNumber(String string){
        return Pattern.compile(REGEX_PHONE_NUMBER).matcher(string).matches();
    }
}
