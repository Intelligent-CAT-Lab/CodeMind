import java.util.*;

public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
System.out.println("[INST]5;arr;sc.next().toCharArray();"+arr);
System.out.println("[INST]5;None;sc.next();"+sc.next());
        char prev = 'A';
        int count = 0;
        for (char c : arr) {
            if (prev >= c) {
                count++;
            }
            prev = c;
        }
        System.out.println(count);
    }
}
