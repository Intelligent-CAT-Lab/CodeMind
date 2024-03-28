

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.charAt(0) + String.valueOf(s.length()-2) + s.charAt(s.length()-1));
    }
}

```
Upvotes: 0 
