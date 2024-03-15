<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
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
```
[/INST]
```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        x = scanner.nextInt();
        y = scanner.nextInt();
        int[] a = {1, 3, 5, 7, 8, 10, 12};
        int[] b = {4, 6, 9, 11};
        if (x == 2 || y == 2) {
            System.out.println("No");
        } else if ((x == a[0] || x == a[1] || x == a[2] || x == a[3] || x == a[4] || x == a[5] || x == a[6]) && (y == a[0] || y == a[1] || y == a[2] || y == a[3] || y == a[4] || y == a[5] || y == a[6])) {
            System.out.println("Yes");
        } else if ((x == b[0] || x == b[1] || x == b[2] || x == b[3]) && (y == b[0] || y == b[1] || y == b[2] || y == b[3])) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```</s>
