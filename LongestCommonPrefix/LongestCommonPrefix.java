public class LongestCommonPrefix {
    public String findLongestCommonPrefix(String[] strs) {
        // Implementation to find the longest common prefix
        if (strs.length == 0) return "";

        String word = strs[0];
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            boolean add = true;
            for (int other = 1; other < strs.length ; other++) {
                if (strs[other].length() <= i || strs[other].charAt(i) != word.charAt(i)) {
                    add = false;
                    break;
                }
            }
            
            if (add) {
                result += word.charAt(i);
            } else {
                return result;
            }
        }
        return result;
    }
}