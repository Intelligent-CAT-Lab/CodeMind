<s> Translate the following python code to java and enclose your solution inside ```java```:
```
ip = input ( )
st = " "
if len ( ip ) != 1 :
    if ip [ 0 ] == "9" :
        st = "9"
        ip = ip [ 1 : ]
    for i in ip :
        if int ( i ) > 4 :
            n = 9 - int ( i )
            st += str ( n )
        else :
            st += i
else :
    st = ip
print ( int ( st ) )


```

### 解答

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        String st = "";
        if (ip.length() != 1) {
            if (ip.charAt(0) == '9') {
                st = "9";
                ip = ip.substring(1);
            }
            for (int i = 0; i < ip.length(); i++) {
                if (Integer.parseInt(ip.charAt(i)) > 4) {
                    int n = 9 - Integer.parseInt(ip.charAt(i));
                    st += String.valueOf(n);
                } else {
                    st += ip.charAt(i);
                }
            }
        } else {
            st = ip;
        }
        System.out.println(Integer.parseInt(st));
    }
}
```

### 解析

1. 首先，我们需要将输入的字符串转换为整数，因此我们需要使用 `Integer.parseInt(ip.charAt(i)) > 4` 来判断输入的字符串是否为整数。
2. 如果输入的字符串是整数，那么我们需要将其转换为字符串，并将其转换为整数。
3. 如果输入的字符串不是整数，那么我们需要将其转换为字符串，并将其转换为整数。
4. 最后，我们需要将输入的字符串转换为整数，并将其转换为字符串。

### 思路

1. 首先，我们需要将输入的字符串转换为整数，因此我们需要使用 `Integer.parseInt(ip.charAt(i)) > 4` 来判断输入的字符串是否为整数。
2. 如果输入的字符串是整数，那么我们需要将其转换为字符串，并将其转换为整数。
3. 如果输入的字符串不是整数，那么我们需要将其转换为字符串，并将其转换为整数。
4. 最后，我们需要将输入的字符串转换为整数，并将其转换为字符串。

### 代码

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        String st = "";
        if (ip.length() != 1) {
            if (ip.charAt(0) == '9') {
                st = "9";
                ip = ip.substring(1);
            }
            for (int i = 0; i < ip.length(); i++) {
                if (Integer.parseInt(ip.charAt(i)) > 4) {
                    int n = 9 - Integer.parseInt(ip.charAt(i));
                    st += String.valueOf(n);
                } else {
                    st += ip.charAt(i);
                }
            }
        } else {
            st = ip;
        }
        System.out.println(Integer.parseInt(st));
    }
}
```

### 解析

1. 首先，我们需要将输入的字符串转换为整数，因此我们需要使用 `Integer.parseInt(ip.charAt(i)) > 4` 来判断输入的字符串是否为整数。
2. 如果输入的字符串是整数，那么我们需要将其转换为字符串，并将其转换为整数。
3. 如果输入的字符串不是整数，那么我们需要将其转换为字符串，并将其转换为整数。
4. 最后，我们需要将输入的字符串转换为整数，并将其转换为字符串。

### 思路

1. 首先，我们需要将输入的字符串转换为整数，因此我们需要使用 `Integer.parseInt(ip.charAt(i)) > 4` 来判断输入的字符串是否为整数。
2. 如果输入的字符串是整数，那么我们需要将其转换为字符串，并将其转换为整数。
3. 如果输入的字符串不是整数，那么我们需要将其转换为字符串，并将其转换为整数。
4. 最后，我们需要将输入的字符串转换为整数，并将其转换为字符串。

### 代码

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        String st = "";
        if (ip.length() != 1) {
            if (ip.charAt(0) == '9') {
                st = "9";
                ip = ip.substring(1);
            }
            for (int i = 0; i < ip.length(); i++) {
                if (Integer.parseInt(ip.charAt(i)) > 4) {
                    int n = 9 - Integer.parseInt(ip.charAt(i));
                    st += String.valueOf(n);
                } else {
                    st += ip.charAt(i);
                }
            }
        } else {
            st = ip;
        }
        System.out.println(Integer.parseInt(st));
    }
}
```

### 解析

1. 首先，我们需要将输入的字符串转换为整数，因此我们需要使用 `Integer.parseInt(ip.charAt(i)) > 4` 来判断输入的字符串是否为整数。
2. 如果输入的字符串是整数，那么我们需要将其转换为字符串，并将其转换为整数。
3. 如果输入的字符串不是整数，那么我们需要将其转换为字符串，并将其转换为整数。
4. 最后，我们需要将输入的字符串转换为整数，并将其转换为字符串。

### 思路

1. 首先，我们需要将输入的字符串转换为整数，因此我们需要使用 `Integer.parseInt(ip.charAt(i)) > 4` 来判断输入的字符串是否为整数。
2. 如果输入的字符串是整数，那么我们需要将其转换为字符串，并将其转换为整数。
3. 如果输入的字符串不是整数，那么我们需要将其转换为字符串，并将其转换为整数。
4.
