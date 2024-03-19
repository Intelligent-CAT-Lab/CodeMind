import java.util.*;

public class p03624 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        List<Character> sList = new ArrayList<>();
        for (char c : sArray) {
            if (!sList.contains(c)) {
                sList.add(c);
            }
        }
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (int i = 0; i < alphabet.length; i++) {
            if (i == sList.size() || alphabet[i] != sList.get(i)) {
                System.out.println(alphabet[i]);
                break;
            }
        }
    }
}