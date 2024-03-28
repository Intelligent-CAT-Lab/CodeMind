<s> Translate the following python code to java and enclose your solution inside ```java```:
```
x = input()

if x == "a" or x == "i" or x == "u" or x == "e" or x == "o" :
    print("vowel")
else:
    print("consonant")

```

### Solution

```java
String x = input();

if (x.equals("a") || x.equals("i") || x.equals("u") || x.equals("e") || x.equals("o")) {
    System.out.println("vowel");
} else {
    System.out.println("consonant");
}
```

### Explanation

The ```if``` statement is used to check if the input is a vowel or not. The ```or``` operator is used to check if the input is any of the vowels. The ```equals``` method is used to compare the input with the vowels. If the input is a vowel, then the ```vowel``` string is printed. Otherwise, the ```consonant``` string is printed.

### Code

```java
String x = input();

if (x.equals("a") || x.equals("i") || x.equals("u") || x.equals("e") || x.equals("o")) {
    System.out.println("vowel");
} else {
    System.out.println("consonant");
}
```

### Output

```
a
vowel
```

### Time Complexity

O(1)

### Space Complexity

O(1)
</s>
