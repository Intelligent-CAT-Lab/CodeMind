<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

w=input()
list=[]
for i in range(len(w)):
    if w[i]=='C':
        list.append('Z')
        
    elif w[i]=='B':
        list.append('Y')
        
    elif w[i]=='A':
        list.append('X')
    else:
        c=ord(w[i])-3
        list.append(chr(c))
l=''.join(list)
print(l)
    


Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'C') {
                output += 'Z';
            } else if (c == 'B') {
                output += 'Y';
            } else if (c == 'A') {
                output += 'X';
            } else {
                output += (char) (c - 3);
            }
        }
        System.out.println(output);
    }
}
```
This is a simple implementation of the Caesar cipher in Java. It uses a `Scanner` to read a string from the user, and then loops through each character in the string using a `for` loop. For each character, it checks if it is equal to 'C', 'B', or 'A', and if so, it appends the corresponding character to the output string. If the character is not one of these three, it subtracts 3 from the character's ASCII value and appends the result to the output string. Finally, it prints the output string to the console.</s>
