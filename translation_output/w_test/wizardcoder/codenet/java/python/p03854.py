Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
erasedream

Expected output:
YES


```
import java.util.Scanner;

public class p03854 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        S = S.replaceAll("eraser", "-");
        S = S.replaceAll("erase", "-");
        S = S.replaceAll("dreamer", "-");
        S = S.replaceAll("dream", "-");
        S = S.replaceAll("-", "");
        if(S.length() == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


        //TLEèµ·ããã...
        //å¾æ¥è¦æ¤è¨(DP, åèª­ã¿Greedyãªã©)
//        String[] str = S.split("");
//        int i = 0;
//        boolean flag = false;
//        while(i < str.length){
//            if(S.substring(i).indexOf("dream") == -1 && S.substring(i).indexOf("erase") == -1) {
//                System.out.println("NO");
//                flag = true;
//                break;
//            }else if(S.substring(i, i + 5).equals("dream")){
//                try {
//                    if (str[i + 5].concat(str[i + 6]).equals("er")) {
//                        if(i + 7 < str.length){
//                            if(str[i + 7].equals("a")){
//                                i = i + 5;
//                            }else{
//                                i = i + 7;
//                            }
//                        }else{
//                            i = i + 5;
//                        }
//                    } else {
//                        i = i + 5;
//                    }
//                }catch (ArrayIndexOutOfBoundsException e){
//                    i = i + 5;
//                }
//            }else if(S.substring(i, i + 5).equals("erase")){
//                try {
//                    if (str[i + 5].equals("r")) {
//                        i = i + 6;
//                    } else {
//                        i = i + 5;
//                    }
//                }catch(ArrayIndexOutOfBoundsException e){
//                    i = i + 5;
//                }
//            }
//        }
//        if(!flag){
//            System.out.println("YES");
//        }
    }
}

```

### Response:
```python
import re

S = input()
S = re.sub("eraser", "-", S)
S = re.sub("erase", "-", S)
S = re.sub("dreamer", "-", S)
S = re.sub("dream", "-", S)
S = re.sub("-", "", S)
if S == "":
    print("YES")
else:
    print("NO")
```

Explanation:

- We first import the `re` module to use regular expressions.
- We take input from the user using the `input()` function and store it in the variable `S`.
- We use the `re.sub()` function to replace all occurrences of the pattern "eraser", "erase", "dreamer", and "dream" with a hyphen `-`.
- We then use the `re.sub()` function again to replace all occurrences of the hyphen `-` with an empty string `""`.
- Finally, we check if the resulting string `S` is empty or not. If it is empty, we print "YES", else we print "NO".<|endoftext|>
