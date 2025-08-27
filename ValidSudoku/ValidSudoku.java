import java.util.Set;
import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> list1 = new HashSet<>();
        Set<Character> list2 = new HashSet<>();
        Set<Character> list3 = new HashSet<>();
        for (int i = 0; i < board.length ; i++) {
            System.out.println("###################################");
            for (int j = 0; j < board.length ; j++) {
                System.out.println(" i: " +(i/3 * 3 + j/3) + " j: " + (i%3 * 3 + j%3));
                if (board[i/3 * 3 + j/3][i%3 * 3 + j%3] != '.' && !list3.add(board[i/3 * 3 + j/3][i%3 * 3 + j%3])) {
                    return false;
                }
                
                if (board[i][j] != '.' && !list1.add(board[i][j]) && board[j][i] != '.' && !list2.add(board[j][i])) {
                    return false;
                }
            }
            list1.clear();
            list2.clear();
            list3.clear();
        }
        return true;
    }
}