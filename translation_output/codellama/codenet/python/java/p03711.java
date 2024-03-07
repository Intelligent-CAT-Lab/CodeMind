<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

def main():
    x, y = map(int, input().split())
    a = [1, 3, 5, 7, 8, 10, 12]
    b = [4, 6, 9, 11]
    if x == 2 or y == 2:
        print('No')
    elif (x in a and y in a) or (x in b and y in b):
        print('Yes')
    else:
        print('No')
main()

Translate the above python code to java.

java code:

[/INST]

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[] a = {1, 3, 5, 7, 8, 10, 12};
        int[] b = {4, 6, 9, 11};
        if (x == 2 || y == 2) {
            System.out.println("No");
        } else if ((x in a && y in a) || (x in b && y in b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}</s>
