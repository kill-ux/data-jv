import java.util.List ;

// Regex class
public class Regex {
    private StringBuilder pattern = new StringBuilder();

    public Regex() {
    }

    public Regex(List<String> component) {
        for (String p : component) {
            pattern.append(p);
        }
    }

    public String getPattern() {
        return pattern.toString();
    }

    public String toString() {
        return this.getPattern();
    }
}