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
        if (sList.size() == alphabet.length) {
            System.out.println("None");
        } else {
            for (int i = 0; i < sList.size(); i++) {
                if (sList.get(i) != alphabet[i]) {
                    System.out.println(alphabet[i]);
                    break;
                }
                if (i == sList.size() - 1) {
                    System.out.println(alphabet[i + 1]);
                }
            }
        }
    }
}