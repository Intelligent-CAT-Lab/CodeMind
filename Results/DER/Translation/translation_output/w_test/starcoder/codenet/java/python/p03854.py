<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
import re

def is_dream(s):
    return re.search(r'dream', s)

def is_erase(s):
    return re.search(r'erase', s)

def is_dreamer(s):
    return re.search(r'dreamer', s)

def is_eraser(s):
    return re.search(r'eraser', s)

def is_dream_eraser(s):
    return re.search(r'dream.*er', s)

def is_erase_eraser(s):
    return re.search(r'erase.*er', s)

def is_dream_erase(s):
    return re.search(r'dream.*erase', s)

def is_dreamer_eraser(s):
    return re.search(r'dreamer.*er', s)

def is_dreamer_erase(s):
    return re.search(r'dreamer.*erase', s)

def is_dream_eraser_erase(s):
    return re.search(r'dream.*er.*erase', s)

def is_dreamer_eraser_erase(s):
    return re.search(r'dreamer.*er.*erase', s)

def is_dream_eraser_dreamer(s):
    return re.search(r'dream.*er.*dreamer', s)

def is_dreamer_eraser_dreamer(s):
    return re.search(r'dreamer.*er.*dreamer', s)

def is_dream_eraser_dreamer_erase(s):
    return re.search(r'dream.*er.*dreamer.*erase', s)

def is_dreamer_eraser_dreamer_erase(s):
    return re.search(r'dreamer.*er.*dreamer.*erase', s)

def is_dream_eraser_dreamer_eraser(s):
    return re.search(r'dream.*er.*dreamer.*er', s)

def is_dreamer_eraser_dreamer_eraser(s):
    return re.search(r'dreamer.*er.*dreamer.*er', s)

def is_dream_eraser_dreamer_eraser_erase(s):
    return re.search(r'dream.*er.*dreamer.*er.*erase', s)

def is_dreamer_eraser_dreamer_eraser_erase(s):
    return re.search(r'dreamer.*er.*dreamer.*er.*erase', s)

def is_dream_eraser_dreamer_eraser_dreamer(s):
    return re.search(r'dream.*er.*dreamer.*er.*dreamer', s)

def is_dreamer_eraser_dreamer_eraser_dreamer(s):
    return re.search(r'dreamer.*er.*dreamer.*er.*dreamer', s)

def is_dream_eraser_dreamer_eraser_dreamer_erase(s):
    return re.search(r'dream.*er.*dreamer.*er.*dreamer.*erase', s)

def is_dreamer_eraser_dreamer_eraser_dreamer_erase(s):
    return re.search(r'dreamer.*er.*dreamer.*er.*dreamer.*erase', s)

def is_dream_eraser_dreamer_eraser_dreamer_eraser(s):
    return re.search(r'dream.*er.*dreamer.*er.*dreamer.*er', s)

def is_dreamer_eraser_dreamer_eraser_dreamer_eraser(s):
    return re.search(r'dreamer.*er.*dreamer.*er.*dreamer.*er', s)

def is_dream_eraser_dreamer_eraser_dreamer_eraser_erase(s):
    return re.search(r'dream.*er.*dreamer.*er.*dreamer.*er.*erase', s)

def is_dreamer_eraser_dreamer_eraser_dreamer_eraser_erase(s):
    return re.search(r'dreamer.*er.*dreamer.*er.*dreamer.*er.*erase', s)

def is_dream_eraser_dreamer_eraser_dreamer_eraser_dreamer(s):
    return re.search(r'dream.*er.*dreamer.*er.*dreamer.*er.*dreamer', s)

def is_dreamer_eraser_dreamer_eraser_dreamer_eraser_dreamer(s):
    return re.search(r'dreamer.*er.*dreamer.*er.*dreamer.*er.*dreamer', s)

def is_dream_eraser_dreamer_eraser_dreamer_eraser_dreamer_erase(s):
    return re.search(r'dream.*er.*dreamer.*er.*dreamer.*er.*dreamer.*erase', s)

def is_dreamer_eraser_dreamer_eraser_dreamer_eraser_dreamer_erase(s):
    return re.search(r'dreamer.*er.*dreamer.*er.*dreamer.*er.*dreamer.*erase', s)

def is_dream_eraser_dreamer_eraser_dreamer_eraser_dreamer_eraser(s):
    return re.search(r'dream.*er.*dreamer.*er.*dreamer.*er.*dreamer.*er', s)

def is_dreamer_eraser_dreamer_eraser_dreamer_eraser_dreamer_eraser(s):
    return re.search(r'dreamer.*er.*dreamer.*er.*dreamer.*er.*dreamer.*er', s)

def is_dream_eraser_dreamer_eraser_dreamer_eraser_dreamer_eraser_erase(s):
    return re.search(r'dream.*er.*
