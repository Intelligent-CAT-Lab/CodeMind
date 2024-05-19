System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
30

Expected output:
 3 6 9 12 13 15 18 21 23 24 27 30


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
x = int(input())
count = 0
a = 1
sb = []

if x >= 3 and x <= 10000:
    while count < x:
        b = a // 10
        if a % 3 == 0:
            sb.append(a)
        else:
            while b!= 0:
                if b % 10 == 3:
                    sb.append(a)
                    break
                b //= 10
        a += 1
        count += 1

print(" ".join(map(str, sb)))
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "30",
]

test_outputs = [
    "3 6 9 12 13 15 18 21 23 24 27 30",
]

for test_input, expected_output in zip(test_inputs, test_outputs):
    output = io.StringIO()
    with redirect_stdout(output):
        p02406.main(test_input.split())
    assert output.getvalue().strip() == expected_output
```<|endoftext|>
