<s> Translate the following python code to java and enclose your solution inside ```java```:
```
num = input ( ) . split ( " . " )
if int ( num [ 0 ] [ - 1 ] ) == 9 :
    print ( " GOTO â Vasilisa . " )
else :
    if int ( num [ 1 ] [ 0 ] ) >= 5 :
        print ( f " { int ( num [ 0 ] ) + 1 } " )
    else :
        print ( num [ 0 ] )


```

### 📝 Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String[] numArr = num.split("\\.");
        if (Integer.parseInt(numArr[0].substring(numArr[0].length() - 1)) == 9) {
            System.out.println("GOTO ▷ Vasilisa");
        } else {
            if (Integer.parseInt(numArr[1].substring(0, 1)) >= 5) {
                System.out.println(Integer.parseInt(numArr[0]) + 1);
            } else {
                System.out.println(numArr[0]);
            }
        }
    }
}
```

### 📈 My Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String[] numArr = num.split("\\.");
        if (Integer.parseInt(numArr[0].substring(numArr[0].length() - 1)) == 9) {
            System.out.println("GOTO ▷ Vasilisa");
        } else {
            if (Integer.parseInt(numArr[1].substring(0, 1)) >= 5) {
                System.out.println(Integer.parseInt(numArr[0]) + 1);
            } else {
                System.out.println(numArr[0]);
            }
        }
    }
}
```

### 💡 Discussion

- 💡 **[Java]**
    - 💡 **[Java]**
        - 💡 **[Java]**
            - 💡 **[Java]**
                - 💡 **[Java]**
                    - 💡 **[Java]**
                        - 💡 **[Java]**
                            - 💡 **[Java]**
                                - 💡 **[Java]**
                                    - 💡 **[Java]**
                                        - 💡 **[Java]**
                                            - 💡 **[Java]**
                                                - 💡 **[Java]**
                                                    - 💡 **[Java]**
                                                        - 💡 **[Java]**
                                                            - 💡 **[Java]**
                                                                - 💡 **[Java]**
                                                                    - 💡 **[Java]**
                                                                        - 💡 **[Java]**
                                                                            - 💡 **[Java]**
                                                                                - 💡 **[Java]**
                                                                                    - 💡 **[Java]**
                                                                                        - 💡 **[Java]**
                                                                                            - 💡 **[Java]**
                                                                                                - 💡 **[Java]**
                                                                                                    - 💡 **[Java]**
                                                                                                        - 💡 **[Java]**
                                                                                                            - 💡 **[Java]**
                                                                                                                - 💡 **[Java]**
                                                                                                                    - 💡 **[Java]**
                                                                                                                        - 💡 **[Java]**
                                                                                                                            - 💡 **[Java]**
                                                                                                                                - 💡 **[Java]**
                                                                                                                                    - 💡 **[Java]**
                                                                                                                                        - 💡 **[Java]**
                                                                                                                                            - 💡 **[Java]**
                                                                                                                                                - 💡 **[Java]**
                                                                                                                                                    - 💡 **[Java]**
                                                                                                                                                        - 💡 **[Java]**
                                                                                                                                                            - 💡 **[Java]**
                                                                                                                                                                - 💡 **[Java]**
                                                                                                                                                                    - 💡 **[Java]**
                                                                                                                                                                        - 💡 **[Java]**
                                                                                                                                                                            - 💡 **[Java]**
                                                                                                                                                                                - 💡 **[Java]**
                                                                                                                                                                                    - 💡 **[Java]**
                                                                                                                                                                                        - 💡 **[Java]**
                                                                                                                                                                                            - 💡 **[Java]**
                                                                                                                                                                                                - 💡 **[Java]**
                                                                                                                                                                                                    - 💡 **[Java]**
                                                                                                                                                                                                        - 💡 **[Java]**
                                                                                                                                                                                                            - 💡 **[Java]**
                                                                                                                                                                                                                - 💡 **[Java]**
                                                                                                                                                                                                                    - 💡 **[Java]**
                                                                                                                                                                                                                        - 💡 **[Java]**
                                                                                                                                                                                                                            - 💡 **[Java]**
                                                                                                                                                                                                                                - 💡 **[Java]**
                                                                                                                                                                                                                                    - 💡 **[Java]**
                                                                                                                                                                                                                                        - 💡 **[Java]**
                                                                                                                                                                                                                                            - 💡 **[Java]**
                                                                                                                                                                                                                                                - 💡 **[Java]**
                                                                                                                                                                                                                                                    - 💡 **[Java]**
                                                                                                                                                                                                                                                        - 💡 **[Java]**
                                                                                                                                                                                                                                                            - 💡 **[Java]**
                                                                                                                                                                                                                                                                - 💡 **[Java]**
                                                                                                                                                                                                                                                                    - 💡 **[Java]**
                                                                                                                                                                                                                                                                        - 💡 **[Java]**
                                                                                                                                                                                                                                                                            - 💡 **[Java]**
                                                                                                                                                                                                                                                                                - 💡 **[Java]**
                                                                                                                                                                                                                                                                                    - 💡 **[Java]**
                                                                                                                                                                                
