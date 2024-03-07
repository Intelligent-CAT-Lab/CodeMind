<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

S = input()

if S == "Sunny":
    print("Cloudy")
elif S=="Cloudy":
    print("Rainy")
else:
    print("Sunny")

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String weather = scanner.nextLine();

        if (weather.equals("Sunny")) {
            System.out.println("Cloudy");
        } else if (weather.equals("Cloudy")) {
            System.out.println("Rainy");
        } else {
            System.out.println("Sunny");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `equals` method to compare the input to the desired weather conditions. The `System.out.println` method is used to print the output.</s>
