System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
77777777

Expected output:
4444477777


```
import java.util.Scanner;

public class codeforces_96_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long number = in.nextLong();
        long ans = -1, value = 0;
        int mask = 2;
        
        while (value < number) {
            String s = Integer.toBinaryString(mask++).substring(1);
            int zeros = 0;
            
            for (char c : s.toCharArray()) {
                if (c == '0') {
                    zeros++;
                }
            }
            
            if (zeros!= s.length() - zeros) {
                continue;
            }
            
            s = s.replace('0', '4');
            s = s.replace('1', '7');
            value = Long.parseLong(s);
        }
        
        System.out.println(value);
    }
}
```


Answer:
```python
def convert_to_lucky(number):
    mask = 2
    while True:
        binary_string = bin(mask)[2:]
        num_zeros = binary_string.count('0')
        num_ones = binary_string.count('1')
        if num_zeros!= num_ones:
            mask += 1
            continue
        lucky_number = binary_string.replace('0', '4').replace('1', '7')
        if int(lucky_number) >= number:
            return int(lucky_number)
        mask += 1

number = int(input())
print(convert_to_lucky(number))
```

You can write the following test cases to ensure it works correctly:

```python
test_cases = [
    (777777777, 44444477777),
    (100000000, 444444444),
    (123456789, 477447744),
]
for number, expected_output in test_cases:
    assert convert_to_lucky(number) == expected_output
```<|endoftext|>
