Below is the translated Python code into Java code, assuming the input is provided via the command line argument:

```java
public class Main {
    public static void main(String[] args) {
        String X = args[0];
        String ans;

        if (X.equals("7") || X.equals("5") || X.equals("3")) {
            ans = "YES";
        } else {
            ans = "NO";
        }

        System.out.println(ans);
    }
}
```

Please note that Java applications are commonly invoked with command-line arguments, and in this code, it's assumed that the test input `5` will be passed as a command-line argument. To match the expected output "YiES" with "YES", it seems there might be an error in the expected output you've given or a special requirement not mentioned. The output based on the provided Python code will be "YES" or "NO", so I maintained the expected logic in the translation.

Make sure to compile and run the Java program using the following commands in your terminal:

```
javac Main.java
java Main 5
```

This will compile `Main.java` and run the program with the input `5`, which should output "YES".
