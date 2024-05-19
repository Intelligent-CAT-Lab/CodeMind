System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
30

Expected output:
44 37 109 62 -37 60 101 -5 19 106 19 58

```
import java.io.*;
   
class p02406{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int count=0;
        int a=1,b;
        if(x>=3 && x<=10000){
            for(; count<x; count++){
                 b = a/10;
                    if(a%3==0){
                        sb.append(" ");
                        sb.append(a);
                    }else{
                        b = a;
                        while(b!=0){
                            if(b%10==3){
                                sb.append(" ");
                                sb.append(a);
                                break;
                            }
                            b /= 10;
                        }
                    }
                    a++;
            }
        }
        System.out.println(sb);
    }
}
```


Answer:
```python
def main():
    x = int(input())
    result = []
    for i in range(1, x + 1):
        if i % 3 == 0 or '3' in str(i):
            result.append(i)
    print(*result)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "30"
expected_output = "44 37 109 62 -37 60 101 -5 19 106 19 58"
output = main()
assert output == expected_output, "Expected output does not match actual output"
```<|endoftext|>
