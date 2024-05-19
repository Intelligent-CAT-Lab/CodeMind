System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
hihi

Expected output:
Yes


```
import java.util.*;

public class p02747 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        String ans = "Yes";


        if(S.length() % 2 == 1){
            ans = "No";
        } else {
            for(int i=0;i < S.length()/2;i+=2){
                if(!S.substring(i,i+2).equals("hi")){
                  ans = "No";
                }
            }
        }
        System.out.println(ans);

    }

}








```


Answer:
```python
def main():
    S = input()

    ans = "Yes"


    if(len(S) % 2 == 1):
        ans = "No"
    else:
        for i in range(0, len(S), 2):
            if S[i:i+2]!= "hi":
                ans = "No"
                break

    print(ans)

if __name__ == "__main__":
    main()
```

Test input:
hihi

Expected output:
Yes<|endoftext|>
