import java.util.*;

public class p03107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        List<Character> list = new ArrayList<>();
        for (char c : input.toCharArray()) {
            list.add(c);
        }
        
        int N = list.size();
        
        int count0 = 0;
        int count1 = 0;
        for (char c : list) {
            if (c == '0') {
                count0++;
            } else if (c == '1') {
                count1++;
            }
        }
        
        int result = 2 * Math.min(count0, count1);
        System.out.println(result);
    }
}