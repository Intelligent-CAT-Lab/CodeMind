
```
s = input()
a = len(s)
flag = True
if s[0] == s[a-1]:
    if a%2 == 1:
        flag = False
    else:
        flag = True
else:
    if a%2 == 1:
        flag = True
    else:
        flag = False
if flag:
    print("First")
else:
    print("Second")
```

## 4.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:
```
azcbobobegghakl
```

Your program should print:
```
Number of times bob occurs is: 2
```

python code:
```
s = input()
count = 0
for i in range(len(s)-2):
    if s[i:i+3] == "bob":
        count += 1
print("Number of times bob occurs is:", count)
```

## 5.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print:
```
Longest substring in alphabetical order is: beggh
```

In the case of ties, print the first substring. For example, if s = 'abcbcd', then your program should print:
```
Longest substring in alphabetical order is: abc
```

python code:
```
s = input()
longest = s[0]
current = s[0]
for i in range(len(s)-1):
    if s[i+1] >= s[i]:
        current += s[i+1]
    else:
        if len(current) > len(longest):
            longest = current
        current = s[i+1]
if len(current) > len(longest):
    longest = current
print("Longest substring in alphabetical order is:", longest)
```

## 6.

Write a program that prints the number of times the string 'bob' occurs in s. For example, if s = 'azcbobobegghakl', then your program should print:
```
Number of times bob occurs is: 2
```

python code:
```
s = input()
count = 0
for i in range(len(s)-2):
    if s[i:i+3] == "bob":
        count += 1
print("Number of times bob occurs is:", count)
```

## 7.

Assume s is a string of lower case characters.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print:
```
Longest substring in alphabetical order is: beggh
```

In the case of ties, print the first substring. For example, if s = 'abcbcd', then your program should print:
```
Longest substring in alphabetical order is: abc
```

python code:
```
s = input()
longest = s[0]
current = s[0]
for i in range(len(s)-1):
    if s[i+1] >= s[i]:
        current += s[i+1]
    else:
        if len(current) > len(longest):
            longest = current
        current = s[i+1]
if len(current) > len(longest):
    longest = current
print("Longest substring in alphabetical order is:", longest)
```

## 8.

Write a program that prints the number of times the string 'bob' occurs in s. For example, if s = 'azcbobobegghakl', then your program should print:
```
Number of times bob occurs is: 2
```

python code:
```
s = input()
count = 0
for i in range(len(s)-2):
    if s[i:i+3] == "bob":
        count += 1
print("Number of times bob occurs is:", count)
```


## 4.

Write a program that prints the number of times the string 'bob' occurs in s. For example, if s = 'azcbobobegghakl', then your program should print:
```
Number of times bob occurs is: 2
```

python code:
```
s = input()
count = 0
for i in range(len(s)-2):
    if s[i:i+3] == "bob":
        count += 1
print("Number of times bob occurs is:", count)
```

## 5.

Assume s is a string of lower case characters.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print:
```
Longest substring in alphabetical order is: beggh
```

In the case of ties, print the first substring. For example, if s = 'abcbcd', then your program should print:
```
Longest substring in alphabetical order is: abc
```

python code:
```
s = input()
longest = s[0]
current = s[0]
for i in range(len(s)-1):
    if s[i+1] >= s[i]:
        current += s[i+1]
    else:
        if len(current) > len(longest):
            longest = current
        current = s[i+1]
if len(current) > len(longest):
    longest = current
print("Longest substring in alphabetical order is:", longest)
```

## 6.

Write a program that prints the number of times the string 'bob' occurs in s. For example, if s = 'azcbobobegghakl', then your program should print:
```
Number of times bob occurs is: 2
```

python code:
```
s = input()
count = 0
for i in range(len(s)-2):
    if s[i:i+3] == "bob":
        count += 1
print("Number of times bob occurs is:", count)
```

## 7.

Assume s is a string of lower case characters.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print:
```
Longest substring in alphabetical order is: beggh
```

In the case of ties, print the first substring. For example, if s = 'abcbcd', then your program should print:
```
Longest substring in alphabetical order is: abc
```

python code:
```
s = input()
longest = s[0]
current = s[0]
for i in range(len(s)-1):
    if s[i+1] >= s[i]:
        current += s[i+1]
    else:
        if len(current) > len(longest):
            longest = current
        current = s[i+1]
if len(current) > len(longest):
    longest = current
print("Longest substring in alphabetical order is:", longest)
```

## 8.

Write a program that prints the number of times the string 'bob' occurs in s. For example, if s = 'azcbobobegghakl', then your program should print:
```
Number of times bob occurs is: 2
```

python code:
```
s = input()
count = 0
for i in range(len(s)-2):
    if s[i:i+3] == "bob":
        count += 1
print("Number of times bob occurs is:", count)
```
/README.md
# Python-for-Java-Programmers

## 1.

Write a program that prints the longest substring of
