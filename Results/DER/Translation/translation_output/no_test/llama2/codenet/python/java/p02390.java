<s> Translate the following python code to java and enclose your solution inside ```java```:
```
ss = int(input())
hour = ss // 60**2
second = ss % 60**2
minute = second // 60
second = second % 60
print('{}:{}:{}'.format(hour, minute, second))

```

### Input

- The first line contains an integer `ss` denoting the seconds.

### Output

- Print the time in the format `hh:mm:ss`.

### Constraints

- `1 <= ss <= 1000000000`

### Example Input

```
123456789
```

### Example Output

```
1:23:56
```

### Explanation

- The seconds are divided into hours, minutes and seconds.
- The hours are calculated by dividing the seconds by 60**2.
- The minutes are calculated by dividing the seconds by 60.
- The seconds are calculated by dividing the seconds by 60.
- The time is printed in the format `hh:mm:ss`.
</s>
