class main:
    import java.util.*;
    
    public class p03865 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            int a = s.length();
            boolean flag = True;
            if(s.charAt(0) == s.charAt(a-1)):
                if(a%2 == 1):
                    flag = False;
                else:
                    flag = True;
            else:
                if(a%2 == 1):
                    flag = True;
                else:
                    flag = False;
            if(flag):
                System.out.println("First");
            else:
                System.out.println("Second");
        }
    }
    
    
    - In Python, we use `True` and `False` instead of `true` and `false`.
    - In Python, we use `:` instead of `;` to end a line of code.
    - In Python, we use `if` instead of `if()` to check for conditions.
    - In Python, we use `==` instead of `=` to compare values.
    - In Python, we use `print()` instead of `System.out.println()`.