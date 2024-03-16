<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```

moji = input()
flag = 0
answer = []

for i in range(0,len(moji)):
    if flag == 1:
        flag = 0
        continue
    if moji[i] == "2":
        answer.append("k")
    elif moji[i] == "3":
        answer.append("s")
    elif moji[i] == "4":
        answer.append("t")
    elif moji[i] == "5":
        answer.append("n")
    elif moji[i] == "6":
        answer.append("h")
    elif moji[i] == "7":
        answer.append("m")
    elif moji[i] == "8":
        answer.append("y")
    elif moji[i] == "9":
        answer.append("r")
    elif moji[i] == "0":
        i+=1
        flag = 1
        if moji[i] == "T":
            answer.append("wa")
        elif moji[i] == "D":
            answer.append("wo")
        elif moji[i] == "U":
            answer.append("nn")
    elif moji[i] == "T":
        answer.append("a")
    elif moji[i] == "L":
        answer.append("i")
    elif moji[i] == "U":
        answer.append("u")
    elif moji[i] == "R":
        answer.append("e")
    elif moji[i] == "D":
        answer.append("o")

for i in answer:
    print(i, end="")

print()


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String moji = sc.next();
        String answer = "";
        for(int i=0;i<moji.length();i++){
            if(moji.charAt(i)=='2'){
                answer+="k";
            }
            else if(moji.charAt(i)=='3'){
                answer+="s";
            }
            else if(moji.charAt(i)=='4'){
                answer+="t";
            }
            else if(moji.charAt(i)=='5'){
                answer+="n";
            }
            else if(moji.charAt(i)=='6'){
                answer+="h";
            }
            else if(moji.charAt(i)=='7'){
                answer+="m";
            }
            else if(moji.charAt(i)=='8'){
                answer+="y";
            }
            else if(moji.charAt(i)=='9'){
                answer+="r";
            }
            else if(moji.charAt(i)=='0'){
                i++;
                if(moji.charAt(i)=='T'){
                    answer+="wa";
                }
                else if(moji.charAt(i)=='D'){
                    answer+="wo";
                }
                else if(moji.charAt(i)=='U'){
                    answer+="nn";
                }
            }
            else if(moji.charAt(i)=='T'){
                answer+="a";
            }
            else if(moji.charAt(i)=='L'){
                answer+="i";
            }
            else if(moji.charAt(i)=='U'){
                answer+="u";
            }
            else if(moji.charAt(i)=='R'){
                answer+="e";
            }
            else if(moji.charAt(i)=='D'){
                answer+="o";
            }
        }
        System.out.println(answer);
    }
}
```
<|endoftext|>
