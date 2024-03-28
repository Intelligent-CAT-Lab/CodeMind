import java.util.*;

public class p00340 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        List<Integer> num = new ArrayList<>();
        
        for (String str : input) {
            num.add(Integer.parseInt(str));
        }
        
        Collections.sort(num);
        
        if (num.get(0).equals(num.get(1)) && num.get(2).equals(num.get(3))) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}