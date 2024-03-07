<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

def main():
    N = input()

    a, b, c, d = list(N)
    if a == b == c or b == c == d:
        print("Yes")
    else:
        print("No")

if __name__ == '__main__':
    main()


Translate the above python code to java.

java code:

[/INST]

public class Main {

    public static void main(String[] args) {
        String N = args[0];

        char a = N.charAt(0);
        char b = N.charAt(1);
        char c = N.charAt(2);
        char d = N.charAt(3);

        if (a == b && b == c || b == c && c == d) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}</s>
