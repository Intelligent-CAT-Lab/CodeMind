<s> Translate the following python code to java and enclose your solution inside ```java```:
```
s=input()
dic={'a':0,'b':0,'c':0}
for c in s:
    dic[c]+=1
a,b,c=dic.values()
print('YES' if max(abs(a-b),abs(b-c),abs(c-a))<=1 else 'NO')
```

### Input

- The first line contains a string `s`
- The second line contains a string `dic`

### Output

- Print `YES` if the answer is `YES` and `NO` if the answer is `NO`

### Constraints

- 1 <= `s` <= 100
- 1 <= `dic` <= 100

### Example

```
Input:
s = "abc"
dic = "000"

Output:
YES
```

### Explanation

```
dic = {'a':0,'b':0,'c':0}

dic['a'] = 1
dic['b'] = 1
dic['c'] = 1

a,b,c = dic.values()

a = 1
b = 1
c = 1

max(abs(a-b),abs(b-c),abs(c-a)) = 1
```
</s>
