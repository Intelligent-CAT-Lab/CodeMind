```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String res = "";
        while (N > 0) {
            N--;
            res += (char)('a' + N % 26);
            N /= 26;
        }
        System.out.println(new StringBuilder(res).reverse().toString());
    }
}
```
