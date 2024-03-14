<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
print(s[::2])
```

java code:<fim_suffix><fim_middle>
```
public class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        System.out.println(s.substring(0, s.length() - 1));
    }
}
```
"""
<|endoftext|>
