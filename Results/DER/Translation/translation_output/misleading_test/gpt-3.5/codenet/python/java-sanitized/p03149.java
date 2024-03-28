import java.util.*;

public class p03149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        
        List<Integer> a = new ArrayList<>();
        for (String i : input) {
            a.add(Integer.parseInt(i));
        }
        Collections.sort(a);
        
        List<Integer> b = Arrays.asList(1, 4, 7, 9);
        
        String ans;
        if (a.equals(b)) {
            ans = "YES";
        } else {
            ans = "NO";
        }
        System.out.println(ans);
    }
}