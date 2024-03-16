<s> Translate the following python code to java and enclose your solution inside ```java```:
```
w=input()
list=[]
for i in range(len(w)):
    if w[i]=='C':
        list.append('Z')
        
    elif w[i]=='B':
        list.append('Y')
        
    elif w[i]=='A':
        list.append('X')
    else:
        c=ord(w[i])-3
        list.append(chr(c))
l=''.join(list)
print(l)
    

```

### Input

```
CBA
```

### Output

```
XYZ
```

### Explanation

```
CBA

C -> Z
B -> Y
A -> X

XYZ
```

### Hint

- [Python](https://www.w3schools.com/python/python_strings.asp)
- [Java](https://www.w3schools.com/java/java_strings.asp)
</s>
