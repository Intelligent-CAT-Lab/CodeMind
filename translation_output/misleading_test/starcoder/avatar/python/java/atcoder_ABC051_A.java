<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
pnxnn,muduhzn,aquud

Expected output:
FLxhm mMuduhzn Rj;uk

```
print ( input ( ). replace ( ", ", " â " ) )


```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(", ");
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i].replace(" ", " ");
        }
        String res = "";
        for(int i=0;i<arr.length;i++){
            res += arr[i].substring(0,1).toUpperCase()+arr[i].substring(1,arr[i].length())+" ";
        }
        System.out.println(res.substring(0,res.length()-1));
    }
}
```
<|endoftext|>
