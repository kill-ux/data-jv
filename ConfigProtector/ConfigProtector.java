import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConfigProtector {
    public String hideSensitiveData(String configFile, List<String> sensitiveKeys) {
        for (String key : sensitiveKeys) {
            configFile = configFile.replaceAll(String.format("(?<=%s=.*).",key),"*");
        }
        return configFile;
    }
}