<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
SENW

Expected output:
Yes


```

def main():
    s = list(input())
    s = list(set(s))
    
    if len(s)==4:
        print("Yes")
    elif len(s)==3:
        print("No")
    elif len(s)==2:
        if "N"in s and "S" in s:
            print("Yes")
        elif "E" in s and "W" in s:
            print("Yes")
        else:
            print("No")
    else:
        print("No")
if __name__=='__main__':
    main()
```
[/INST]
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c : chars) {
            set.add(c);
        }
        if (set.size() == 4) {
            System.out.println("Yes");
        } else if (set.size() == 3) {
            System.out.println("No");
        } else if (set.size() == 2) {
            if (set.contains('N') && set.contains('S')) {
                System.out.println("Yes");
            } else if (set.contains('E') && set.contains('W')) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}
```
This code uses a `Scanner` to read the input from the user, and then it converts the input to a `char[]` array using the `toCharArray()` method. It then creates a `Set` to store the unique characters in the input, and checks the size of the set to determine the output. If the size of the set is 4, it means that all 4 characters are unique, so it prints "Yes". If the size of the set is 3, it means that there are 3 unique characters, so it prints "No". If the size of the set is 2, it means that there are 2 unique characters, so it checks if the set contains both 'N' and 'S', and if it does, it prints "Yes". If it doesn't, it checks if the set contains both 'E' and 'W', and if it does, it prints "Yes". If it doesn't, it prints "No". Finally, if the size of the set is less than 2, it means that there are no unique characters, so it prints "No".</s>
