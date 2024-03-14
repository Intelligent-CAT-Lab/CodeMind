<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
print('2018'+input()[4:])
```

java code:<fim_suffix><fim_middle>
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("2018"+(new Scanner(System.in)).nextLine().substring(4));
    }
}
```
"""


def main():
    pass


if __name__ == "__main__":
    main()
<|endoftext|>
