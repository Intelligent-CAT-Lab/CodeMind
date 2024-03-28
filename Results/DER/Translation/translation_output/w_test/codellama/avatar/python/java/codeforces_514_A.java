<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5728

Expected output:
4221


```
ip = input ( )
st = " "
if len ( ip ) != 1 :
    if ip [ 0 ] == "9" :
        st = "9"
        ip = ip [ 1 : ]
    for i in ip :
        if int ( i ) > 4 :
            n = 9 - int ( i )
            st += str ( n )
        else :
            st += i
else :
    st = ip
print ( int ( st ) )


```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = "";
        if (input.length() != 1) {
            if (input.charAt(0) == '9') {
                output += "9";
                input = input.substring(1);
            }
            for (int i = 0; i < input.length(); i++) {
                if (Character.getNumericValue(input.charAt(i)) > 4) {
                    int n = 9 - Character.getNumericValue(input.charAt(i));
                    output += String.valueOf(n);
                } else {
                    output += input.charAt(i);
                }
            }
        } else {
            output = input;
        }
        System.out.println(Integer.parseInt(output));
    }
}
```
This code takes a string as input, and then checks if the first character is a 9. If it is, it adds a 9 to the output and removes the first character from the input. Then, it iterates over the remaining characters of the input and checks if each character is greater than 4. If it is, it adds the difference between 9 and the character's value to the output. If it's not, it adds the character to the output. Finally, it prints the output as an integer.

Here's an example of how the code works:

Input: 5728

Output: 4221

Explanation: The code starts by checking if the input is a single digit. If it is, it simply adds the input to the output and prints it. If the input is not a single digit, it checks if the first character is a 9. If it is, it adds a 9 to the output and removes the first character from the input. Then, it iterates over the remaining characters of the input and checks if each character is greater than 4. If it is, it adds the difference between 9 and the character's value to the output. If it's not, it adds the character to the output. Finally, it prints the output as an integer.

In this case, the input is 5728, so the code checks if the first character is a 9. It is not, so it moves on to the next step. It then iterates over the remaining characters of the input and checks if each character is greater than 4. The first character, 5, is not greater than 4, so it adds it to the output. The second character, 7, is greater than 4, so it adds the difference between 9 and 7, which is 2, to the output. The third character, 2, is not greater than 4, so it adds it to the output. The fourth character, 8, is greater than 4, so it adds the difference between 9 and 8, which is 1, to the output. Finally, it prints the output as an integer, which is 4221.</s>
