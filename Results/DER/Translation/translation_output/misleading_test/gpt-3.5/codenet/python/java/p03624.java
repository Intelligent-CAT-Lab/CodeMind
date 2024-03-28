```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] s = input.toCharArray();
        
        List<Character> s2 = new ArrayList<>();
        for (char c : s) {
            s2.add(c);
        }
        
        List<Character> s3 = new ArrayList<>(new HashSet<>(s2));
        Collections.sort(s3);
        
        char[] s4 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
        if (Arrays.equals(s3.toArray(), s4)) {
            System.out.println("None");
        } else {
            for (int i = 0; i < s3.size(); i++) {
                if (s3.get(i) != s4[i]) {
                    System.out.println(s4[i]);
                    break;
                }
                if (i == s3.size()-1) {
                    System.out.println(s4[i+1]);
                }
            }
        }
    }
}
```
