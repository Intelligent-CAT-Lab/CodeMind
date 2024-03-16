```java
import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        System.out.println((int)Math.ceil((double)(H*W)/2) != 1 && H != 1 && W != 1 ? 1 : (int)Math.ceil((double)(H*W)/2));
    }
}
```
