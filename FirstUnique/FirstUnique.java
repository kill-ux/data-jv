import java.util.ArrayList;
import java.util.List;

public class FirstUnique {
    public char findFirstUnique(String s) {
        // Implementation to find the first non-repeating character
        if (s == null) return '_';
        
        List<Character> list = new ArrayList<>();
        for (int i= 0; i < s.length() ; i++) {
            if (!list.contains(s.charAt(i))) {
                list.add(s.charAt(i));
            } else {
                list.remove(Character.valueOf(s.charAt(i)));
            }
        }
        return list.size() > 0 ? list.get(0) : '_';
    }
}