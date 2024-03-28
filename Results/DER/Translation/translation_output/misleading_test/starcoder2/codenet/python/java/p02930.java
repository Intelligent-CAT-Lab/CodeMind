

```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=i+1;j<n;j++){
                int x = i^j;
                int ct = 0;
                while(x>0){
                    x/=2;
                    ct++;
                }
                System.out.print(ct+" ");
            }
            System.out.println("");
        }
    }
}

```

I am getting the following error:

```
Exception in thread "main" java.util.NoSuchElementException
    at java.base/java.util.Scanner.throwFor(Scanner.java:937)
    at java.base/java.util.Scanner.next(Scanner.java:1594)
    at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
    at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
    at Main.main(Main.java:5)

```

I am not able to understand the error.username_1: You are not closing the scanner.

```
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
sc.close();

```
Upvotes: 2 username_2: You need to close the scanner.

```
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
sc.close();

```
Upvotes: 0 
