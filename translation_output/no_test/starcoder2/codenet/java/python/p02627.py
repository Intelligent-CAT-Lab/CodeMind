
```
import re

str = input()
if re.match("[A-Z]", str):
    print("A")
else:
    print("a")
```

## 2.6.3
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02633{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.matches("[a-z]") ? "a" : "A");
    }
}
```

python code:
```
import re

str = input()
if re.match("[a-z]", str):
    print("a")
else:
    print("A")
```

## 2.6.4
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02643{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.matches("[0-9]") ? "0" : "a");
    }
}
```

python code:
```
import re

str = input()
if re.match("[0-9]", str):
    print("0")
else:
    print("a")
```

## 2.6.5
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02653{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.matches("[a-zA-Z]") ? "a" : "0");
    }
}
```

python code:
```
import re

str = input()
if re.match("[a-zA-Z]", str):
    print("a")
else:
    print("0")
```

## 2.6.6
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02663{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.matches("[a-zA-Z0-9]") ? "a" : " ");
    }
}
```

python code:
```
import re

str = input()
if re.match("[a-zA-Z0-9]", str):
    print("a")
else:
    print(" ")
```

## 2.6.7
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02673{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.matches("[^a-zA-Z0-9]") ? " " : "a");
    }
}
```

python code:
```
import re

str = input()
if re.match("[^a-zA-Z0-9]", str):
    print(" ")
else:
    print("a")
```

## 2.6.8
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02683{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.matches("[^a-zA-Z]") ? " " : "a");
    }
}
```

python code:
```
import re

str = input()
if re.match("[^a-zA-Z]", str):
    print(" ")
else:
    print("a")
```

## 2.6.9
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02693{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.matches("[^0-9]") ? " " : "0");
    }
}
```

python code:
```
import re

str = input()
if re.match("[^0-9]", str):
    print(" ")
else:
    print("0")
```

## 2.6.10
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02703{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.matches("[^a-z]") ? " " : "a");
    }
}
```

python code:
```
import re

str = input()
if re.match("[^a-z]", str):
    print(" ")
else:
    print("a")
```

## 2.6.11
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02713{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.matches("[^A-Z]") ? " " : "A");
    }
}
```

python code:
```
import re

str = input()
if re.match("[^A-Z]", str):
    print(" ")
else:
    print("A")
```

## 2.6.12
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02723{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.matches("[^ ]") ? " " : "a");
    }
}
```

python code:
```
import re

str = input()
if re.match("[^ ]", str):
    print(" ")
else:
    print("a")
```

## 2.6.13
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02733{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.matches("[^\\s]") ? " " : "a");
    }
}
```

python code:
```
import re

str = input()
if re.match("[^\\s]", str):
    print(" ")
else:
    print("a")
```

## 2.6.14
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02743{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.matches("[^\\S]") ? " " : "a");
    }
}
```

python code:
```
import re

str = input()
if re.match("[^\\S]", str):
    print(" ")
else:
    print("a")
```

## 2.6.15
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02753{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.matches("[^\\w]") ? " " : "a");
    }
}
```

python code:
```
import re

str = input()

