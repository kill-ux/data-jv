import java.util.regex.*;
import java.util.*;

public class HTMLValidator {
    public boolean validateHTML(String html) {
        // Implementation to validate if the given HTML is correctly formatted
        Pattern p = Pattern.compile("(?<=<)[^<>]*(?=>)");
        Matcher m = p.matcher(html);
        String[] tab = m.results().map(MatchResult::group).toArray(String[]::new);
        List<String> list = new ArrayList<>();
        for(String ele : tab) {
            if (ele.startsWith("/")) {
                if (list.size() > 0 && ele.equals(list.remove(list.size() - 1))) {
                    continue;
                } else {
                    return false;
                }
            } else if (!ele.endsWith("/")) {
                list.add("/"+ele);
            }
        }
        return list.size() == 0;
    }
}


