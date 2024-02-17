import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        String result = "No";
        if (a <= c && c <= b) result ="Yes";
        
        System.out.println(result);
      
    }
}
