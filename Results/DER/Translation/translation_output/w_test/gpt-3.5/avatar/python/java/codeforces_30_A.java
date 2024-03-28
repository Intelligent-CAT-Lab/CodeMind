```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitInput = input.split(" ");
        
        int a = Integer.parseInt(splitInput[0]);
        int b = Integer.parseInt(splitInput[1]);
        int n = Integer.parseInt(splitInput[2]);
        
        if(a != 0) {
            if(b % a != 0) {
                System.out.println("No solution");
            } else {
                b = b / a;
                int x = 0, y = -2000;
                if(b >= 0) {
                    while(y < b) {
                        y = (int) Math.pow(x, n);
                        x++;
                    }
                    if(y > b) {
                        System.out.println("No solution");
                    } else {
                        System.out.println(x - 1);
                    }
                } else {
                    if(n % 2 == 0) {
                        System.out.println("No solution");
                    } else {
                        x = -1;
                        y = 2000;
                        while(y > b) {
                            y = (int) Math.pow(x, n);
                            x--;
                        }
                        if(y < b) {
                            System.out.println("No solution");
                        } else {
                            System.out.println(x + 1);
                        }
                    }
                }
            }
        } else {
            if(b == 0) {
                System.out.println(5);
            } else {
                System.out.println("No solution");
            }
        }
    }
}
```

