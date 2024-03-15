<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c = map(int,input().split())
if a == b and b != c:
  print("Yes")
elif b == c and a != b:
  print("Yes")
elif a == c and a != b:
  print("Yes")
else:
  print("No")
```

### Hint

- Use ```String[]``` to store the input
- Use ```Arrays.sort()``` to sort the array
- Use ```Arrays.equals()``` to compare the array
- Use ```Arrays.toString()``` to print the array
</s>
