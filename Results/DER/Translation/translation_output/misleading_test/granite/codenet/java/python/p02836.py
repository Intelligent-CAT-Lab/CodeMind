System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
redcoder

Expected output:
44

```
import java.util.Scanner;

public class p02836 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int length = s.length();

        int count =0;
        for(int i=0;i<length/2;i++){
            char a = s.charAt(i);
            char b = s.charAt(length - 1 -i );
            if(a!= b){
                count++;
            }

//            System.out.println(String.valueOf(a) + String.valueOf(b));

        }
        System.out.println(count);






    }
}
```


Answer:
```python
def main():
    s = input()
    length = len(s)

    count = 0
    for i in range(length // 2):
        a = s[i]
        b = s[length - 1 - i]
        if a!= b:
            count += 1

    print(count)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "redcoder"
expected_output = 44

output = main(test_input)
assert output == expected_output
```<|endoftext|>
