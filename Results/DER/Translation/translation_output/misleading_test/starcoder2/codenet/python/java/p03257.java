
```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int MM = 510;
        int M = 255;
        long[][] A = new long[MM][MM];
        for(int i = 0; i < MM; i++)
        {
            for(int j = 0; j < MM; j++)
            {
                A[i][j] = 1;
            }
        }
        for(int n = 0; n < MM; n++)
        {
            if(n % 2 == 0)
            {
                for(int i = 0; i < M; i++)
                {
                    A[n][2*i] *= primes[n/2+i];
                }
                for(int i = 0; i < M; i++)
                {
                    A[n][2*i] *= primes[MM+M-n/2-i];
                }
                for(int i = 1; i < MM; i+=2)
                {
                    A[n][i] *= A[n][i-1];
                }
                for(int i = 1; i < MM-1; i+=2)
                {
                    A[n][i] *= A[n][i+1];
                }
                A[n][1] += 1;
            }
            else
            {
                for(int i = 0; i < M; i++)
                {
                    A[n][2*i+1] *= primes[(n+1)/2+i];
                }
                for(int i = 0; i < M; i++)
                {
                    A[n][2*i+1] *= primes[MM+M-(n-1)/2-i];
                }
                for(int i = 0; i < MM; i+=2)
                {
                    A[n][i] *= A[n][i+1];
                }
                for(int i = 2; i < MM; i+=2)
                {
                    A[n][i] *= A[n][i-1];
                }
                A[n][0] += 1;
            }
        }
        for(int i = 1; i <= N; i++)
        {
            for(int j = 1; j <= N; j++)
            {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

## 2.

Write a function that takes a string and returns the number of vowels in the string.

```
def vowel_count(string):
    vowels = "aeiou"
    count = 0
    for letter in string:
        if letter in vowels:
            count += 1
    return count
```

## 3.

Write a function that takes a string and returns the number of consonants in the string.

```
def consonant_count(string):
    vowels = "aeiou"
    count = 0
    for letter in string:
        if letter not in vowels:
            count += 1
    return count
```

## 4.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_consonant_count(string):
    vowels = "aeiou"
    vowel_count = 0
    consonant_count = 0
    for letter in string:
        if letter in vowels:
            vowel_count += 1
        else:
            consonant_count += 1
    return vowel_count, consonant_count
```

## 5.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_consonant_count(string):
    vowels = "aeiou"
    vowel_count = 0
    consonant_count = 0
    for letter in string:
        if letter in vowels:
            vowel_count += 1
        else:
            consonant_count += 1
    return vowel_count, consonant_count
```

## 6.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_consonant_count(string):
    vowels = "aeiou"
    vowel_count = 0
    consonant_count = 0
    for letter in string:
        if letter in vowels:
            vowel_count += 1
        else:
            consonant_count += 1
    return vowel_count, consonant_count
```

## 7.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_consonant_count(string):
    vowels = "aeiou"
    vowel_count = 0
    consonant_count = 0
    for letter in string:
        if letter in vowels:
            vowel_count += 1
        else:
            consonant_count += 1
    return vowel_count, consonant_count
```

## 8.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_consonant_count(string):
    vowels = "aeiou"
    vowel_count = 0
    consonant_count = 0
    for letter in string:
        if letter in vowels:
            vowel_count += 1
        else:
            consonant_count += 1
    return vowel_count, consonant_count
```

## 9.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_consonant_count(string):
    vowels = "aeiou"
    vowel_count = 0
    consonant_count = 0
    for letter in string:
        if letter in vowels:
            vowel_count += 1
        else:
            consonant_count += 1
    return vowel_count, conson
