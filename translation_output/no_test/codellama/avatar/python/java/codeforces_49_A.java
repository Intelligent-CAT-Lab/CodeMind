<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

sentence = input ( )
start , letter = - 1 , str ( )
while True :
    if ( sentence [ start ] != ' â ' ) and ( sentence [ start ] != ' ? ' ) :
        letter = sentence [ start ]
        break
    start -= 1
if letter . lower ( ) in [ ' a ' , ' e ' , ' i ' , ' o ' , ' u ' , ' y ' ] :
    print ( ' YES ' )
else :
    print ( ' NO ' )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class VowelChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        int start = sentence.length() - 1;
        String letter = "";
        while (start >= 0) {
            if (sentence.charAt(start) != ' ' && sentence.charAt(start) != '?') {
                letter = sentence.substring(start, start + 1);
                break;
            }
            start--;
        }
        if (letter.toLowerCase().matches("[aeiouy]")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

This code uses the `Scanner` class to read input from the user, and the `String` class to manipulate the input string. The `matches` method is used to check if the last letter of the input string is a vowel.</s>
