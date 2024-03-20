
```python
#8-A

n = input()

for i in n:
    if i.islower():
        print(i.upper(), end='')
    elif i.isupper():
        print(i.lower(), end='')
    else:
        print(i, end='')
```

## 8-B

Write a program that reads a string and prints the number of vowels and consonants in the string.

```
//8-B
import java.util.Scanner;

class p02415 {
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        
        int num = n.length();
        
        int vowel = 0;
        int consonant = 0;
        
        for( int i = 0 ; i < num ; i++ ){
            
            if(n.charAt(i) == 'a' || n.charAt(i) == 'e' || n.charAt(i) == 'i' || n.charAt(i) == 'o' || n.charAt(i) == 'u' || n.charAt(i) == 'A' || n.charAt(i) == 'E' || n.charAt(i) == 'I' || n.charAt(i) == 'O' || n.charAt(i) == 'U'){
                
                vowel++;
                
            }else if(n.charAt(i) != ' '){
                
                consonant++;
                
            }
            
        }
        
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);
    }
}
```

python code:
```python
#8-B

n = input()

vowel = 0
consonant = 0

for i in n:
    if i in 'aeiouAEIOU':
        vowel += 1
    elif i != ' ':
        consonant += 1

print('Vowels: ', vowel)
print('Consonants: ', consonant)
```

## 8-C

Write a program that reads a string and prints the number of uppercase letters and lowercase letters in the string.

```
//8-C
import java.util.Scanner;

class p02415 {
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        
        int num = n.length();
        
        int upper = 0;
        int lower = 0;
        
        for( int i = 0 ; i < num ; i++ ){
            
            if(Character.isUpperCase(n.charAt(i))){
                
                upper++;
                
            }else if(Character.isLowerCase(n.charAt(i))){
                
                lower++;
                
            }
            
        }
        
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
    }
}
```

python code:
```python
#8-C

n = input()

upper = 0
lower = 0

for i in n:
    if i.isupper():
        upper += 1
    elif i.islower():
        lower += 1

print('Uppercase: ', upper)
print('Lowercase: ', lower)
```

## 8-D

Write a program that reads a string and prints the number of digits and letters in the string.

```
//8-D
import java.util.Scanner;

class p02415 {
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        
        int num = n.length();
        
        int digit = 0;
        int letter = 0;
        
        for( int i = 0 ; i < num ; i++ ){
            
            if(Character.isDigit(n.charAt(i))){
                
                digit++;
                
            }else if(Character.isLetter(n.charAt(i))){
                
                letter++;
                
            }
            
        }
        
        System.out.println("Letters: " + letter);
        System.out.println("Digits: " + digit);
    }
}
```

python code:
```python
#8-D

n = input()

digit = 0
letter = 0

for i in n:
    if i.isdigit():
        digit += 1
    elif i.isalpha():
        letter += 1

print('Letters: ', letter)
print('Digits: ', digit)
```

## 8-E

Write a program that reads a string and prints the number of white spaces, digits, vowels, and consonants in the string.

```
//8-E
import java.util.Scanner;

class p02415 {
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        
        int num = n.length();
        
        int space = 0;
        int digit = 0;
        int vowel = 0;
        int consonant = 0;
        
        for( int i = 0 ; i < num ; i++ ){
            
            if(n.charAt(i) == ' '){
                
                space++;
                
            }else if(n.charAt(i) == 'a' || n.charAt(i) == 'e' || n.charAt(i) == 'i' || n.charAt(i) == 'o' || n.charAt(i) == 'u' || n.charAt(i) == 'A' || n.charAt(i) == 'E' || n.charAt(i) == 'I' || n.charAt(i) == 'O' || n.charAt(i) == 'U'){
                
                vowel++;
                
            }else if(Character.isDigit(n.charAt(i))){
                
                digit++;
                
            }else if(Character.isLetter(n.charAt(i))){
                
                consonant++;
                
            }
            
        }
        
        System.out.println("White Spaces: " + space);
        System.out.println("Digits: " + digit);
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);
    }
}
```

python code:
```python
#8-E

n = input()

space = 0
digit = 0
vowel = 0
consonant = 0

for i in n:
    if i == ' ':
        space += 1
    elif i in 'aeiouAEIOU':
        vowel += 1
    elif i.isdigit():
        digit += 1
    elif i.isalpha():
        consonant += 1

print('White Spaces: ', space)
print('Digits: ', digit)
print('Vowels: ', vowel)
print('Consonants: ', consonant)
```

## 8-F

Write a program that reads a string and prints the number of uppercase letters, lowercase letters, and other characters in the string.

```
//8-F
import java.util.Scanner;

class p02415 {
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        
        int num = n.length();
        
        int upper = 0;
        int lower = 0;
        int other = 0;
        
        for( int i = 0 ; i < num ; i++ ){
            
            if(Character.isUpperCase(n.charAt(i))){
        
