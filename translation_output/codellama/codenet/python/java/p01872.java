<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

def is_collect(fixed_number):
  score = 0
  for i in range(1, 7):
    score += int(fixed_number[i]) * (i + 1)
  for i in range(7, 12):
    score += int(fixed_number[i]) * (i - 5)
  last = 11 - score % 11
  if str(last) == fixed_number[0] or (last >= 10 and fixed_number[0] == "0"):
    return True
  else:
    return False

def check(s):
  index = s.index("?")
  cnt = 0
  for i in range(10):
    c = str(i)
    fixed_number = s[:index] + c + s[index + 1:]
    if is_collect(fixed_number):
      cnt += 1
      ret = i
  if cnt == 1:return ret
  else:return None

ans = check(input()[::-1])
print(ans if ans != None else "MULTIPLE")



Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class CollectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split("");
        int[] scores = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            scores[i] = Integer.parseInt(numbers[i]) * (i + 1);
        }
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        int last = 11 - sum % 11;
        if (last == Integer.parseInt(numbers[0])) {
            System.out.println("MULTIPLE");
        } else {
            System.out.println(last);
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `split` method to split the input string into an array of individual digits. It then calculates the sum of the digits and the last digit of the sum, and checks if the last digit is equal to the first digit of the input. If it is, it prints "MULTIPLE", otherwise it prints the last digit.

Note that this code assumes that the input is a string of digits, and it will throw an exception if the input is not a valid string of digits. You may want to add some error handling to the code to handle invalid input.</s>
