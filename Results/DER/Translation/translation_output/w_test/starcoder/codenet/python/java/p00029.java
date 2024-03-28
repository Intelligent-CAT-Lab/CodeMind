<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
Thank you for your mail and your lectures

Expected output:
your lectures


```
a = list(input().split())
print(max(a, key=a.count), max(a, key=len))

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        int max = 0;
        String maxStr = "";
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                maxStr = arr[i];
            }
        }
        System.out.println(maxStr);
    }
}
```

'''
<|endoftext|>
