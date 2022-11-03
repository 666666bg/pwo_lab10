package pwo.lab10.chain;
import java.util.regex.Pattern;

public class TxtProcRemoveDigits extends TxtProc {
    public static String ACTION = "REMOVE_DIGITS";
    private final Pattern pattern = Pattern.compile("\\d");

    @Override
    public String processRequest(Request request) {
        if (request.action.toUpperCase().equals(ACTION)) {
            return pattern.matcher(request.text).replaceAll("");
        } else return next(request);
    }
}
