import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        String input = "234";

        String[] letters = {"0", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

        ArrayList<String> result = new ArrayList<>();
        result.add("");
        ArrayList<String> temp = new ArrayList<>();

        for(int i = 0; i < input.length(); i++) {
            String currLetters = letters[Integer.parseInt(String.valueOf(input.charAt(i)))];
            for(String str : result) {
                for(int j = 0; j < currLetters.length(); j++)
                    temp.add(str + currLetters.charAt(j));
            }
            result = temp;
            temp = new ArrayList<>();
        }
        System.out.println(result);
    }
}
