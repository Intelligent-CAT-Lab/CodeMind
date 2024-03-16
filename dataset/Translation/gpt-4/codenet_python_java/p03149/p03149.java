import java.util.*;

public class p03149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading a single line of input and splitting it by space
        String[] inputStrings = scanner.nextLine().split(" ");
        
        // Parsing integers from input strings and sorting them
        List<Integer> a = new ArrayList<>();
        for (String item : inputStrings) {
            a.add(Integer.parseInt(item));
        }
        Collections.sort(a);
        
        // Defining list b
        List<Integer> b = Arrays.asList(1, 4, 7, 9);
        
        // Comparing lists a and b
        String ans = a.equals(b) ? "YES" : "NO";
        
        // Printing the result
        System.out.println(ans);
        scanner.close();
    }
}