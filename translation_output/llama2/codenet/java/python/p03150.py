<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03150 {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      // åå¾
	  String s = sc.next();
      if(check(s)){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }
    //ã­ã¼ã¨ã³ã¹ããª
    static boolean check(String s){
        if(s.equals("keyence")){
          return true;
        }else{
          for(int i=0;i<s.length();i++){
          	for(int j=i+1;j<=s.length();j++){
            	 String str = s.substring(0,i)+s.substring(j);
                 if(str.equals("keyence")){
                   return true;
                 }
          	}
          }
        }
      return false;
    } 
}
```

## 解答

```python
import java.util

def main():
    s = input()
    if check(s):
        print("YES")
    else:
        print("NO")

def check(s):
    if s == "keyence":
        return True
    for i in range(len(s)):
        for j in range(i+1, len(s)):
            str = s[:i] + s[j:]
            if str == "keyence":
                return True
    return False

if __name__ == "__main__":
    main()
```

## 解説

### 解答

```python
import java.util

def main():
    s = input()
    if check(s):
        print("YES")
    else:
        print("NO")

def check(s):
    if s == "keyence":
        return True
    for i in range(len(s)):
        for j in range(i+1, len(s)):
            str = s[:i] + s[j:]
            if str == "keyence":
                return True
    return False

if __name__ == "__main__":
    main()
```

### 解説

- 入力を`input()`で取得している。
- 文字列`s`を`check()`関数に渡して、`s`が`"keyence"`と等しい場合は`True`を返し、そうでない場合は`False`を返す。
- `check()`関数は、`s`が`"keyence"`と等しい場合は`True`を返し、そうでない場合は`s`の`i`番目の文字と`j`番目の文字を`s[:i]`と`s[j:]`で切り出して、`s[:i]`と`s[j:]`を`str`として`s[:i] + s[j:]`を作り、`str`が`"keyence"`と等しい場合は`True`を返し、そうでない場合は`False`を返す。
- このようにして、`s`が`"keyence"`と等しい場合は`True`を返し、そうでない場合は`False`を返す。

### 解答

```python
import java.util

def main():
    s = input()
    if check(s):
        print("YES")
    else:
        print("NO")

def check(s):
    if s == "keyence":
        return True
    for i in range(len(s)):
        for j in range(i+1, len(s)):
            str = s[:i] + s[j:]
            if str == "keyence":
                return True
    return False

if __name__ == "__main__":
    main()
```

### 解説

- 入力を`input()`で取得している。
- 文字列`s`を`check()`関数に渡して、`s`が`"keyence"`と等しい場合は`True`を返し、そうでない場合は`False`を返す。
- `check()`関数は、`s`が`"keyence"`と等しい場合は`True`を返し、そうでない場合は`s`の`i`番目の文字と`j`番目の文字を`s[:i]`と`s[j:]`で切り出して、`s[:i]`と`s[j:]`を`str`として`s[:i] + s[j:]`を作り、`str`が`"keyence"`と等しい場合は`True`を返し、そうでない場合は`False`を返す。
- このようにして、`s`が`"keyence"`と等しい場合は`True`を返し、そうでない場合は`False`を返す。

### 解答

```python
import java.util

def main():
    s = input()
    if check(s):
        print("YES")
    else:
        print("NO")

def check(s):
    if s == "keyence":
        return True
    for i in range(len(s)):
        for j in range(i+1, len(s)):
            str = s[:i] + s[j:]
            if str == "keyence":
                return True
    return False

if __name__ == "__main__":
    main()
```

### 解説

- 入力を`input()`で取得している。
- 文字列`s`を`check()`関数に渡して、`s`が`"keyence"`と等しい場合は`True`を返し、そうでない場合は`False`を返す。
- `check()`関数は、`s`が`"keyence"`と等しい場合は`True`を返し、そうでない場合は`s`の`i`番目の文字と`j`番目の文字を`s[:i]`と`s[j:]`で切り出して、`s[:i]`と`s[j:]`を`str`として`s[:i] + s[j:]`を作り、`str`が`"keyence"`と等しい場合は`True`を返し、そうでない場合は`False`を返す。
- このようにして、`s`が`"keyence"`と等しい場合は`True`を返し、そうでない場合は`False`を返す。

### 解答

```python
import java.util

def main():
    s = input()
    if check(s):
        print("YES")
    else:
        print("NO")

def check(s):
    if s == "keyence":
        return True
    for i in range(len(s)):
        for j in range(i+1, len(s)):
            str = s[:i] + s[j:]
            if str == "keyence":
                return True
    return False

if __name__ == "__main__":
    main()
```

### 解説

- 入力を`input()`で取得している。
- 文字列`s`を`check()`関数に渡して、`s`が`"keyence"`と等しい場合は`True`を返し、そうでない場合は`False`を返す。
- `check()`関数は、`s`が`"keyence"`と等しい場合は`True`を返し、そうでない場合は`s`の`i`番目の文字と`j`番目の文字を`s[:i]`と`s[j:]`で切り出して、`s[:i]`と`
