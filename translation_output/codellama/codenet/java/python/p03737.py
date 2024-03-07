<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;

public class p03737{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in)){
                        for(int i = 0; i < 3; i++){
                                System.out.print(Character.toUpperCase(sc.next().charAt(0)));
                        }
                        System.out.println("");
                }
        }
}

Translate the above java code to python.

python code:

[/INST]
```
import java.util.*;

public class p03737{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in)){
                        for(int i = 0; i < 3; i++){
                                System.out.print(Character.toUpperCase(sc.next().charAt(0)));
                        }
                        System.out.println("");
                }
        }
}
```

Here's the equivalent Python code:
```
import java.util.*;

public class p03737:
    def main(self, args):
        try:
            sc = Scanner(System.in)
            for i in range(3):
                print(Character.toUpperCase(sc.next().charAt(0)))
            print("")
        finally:
            sc.close()
```
Note that the `try` block is used to handle the `Scanner` object, and the `finally` block is used to close the `Scanner` object when it is no longer needed.</s>
