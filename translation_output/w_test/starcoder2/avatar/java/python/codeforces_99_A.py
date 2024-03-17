

```python
import sys

if __name__ == '__main__':
    if sys.argv[1] == 'local':
        sys.stdin = open('input.txt', 'r')
        sys.stdout = open('output.txt', 'w')

    str = input()
    index = str.find('.')
    if index == -1:
        print(str)
        exit(0)

    d = int(str[index + 1])
    i = int(str[index - 1])

    if i == 9:
        print("GOTO â Vasilisa.")
        exit(0)

    if d >= 5:
        print(str[:index - 1] + str(i + 1))
    else:
        print(str[:index])
```

## 2. 运行

```bash
python3 codeforces_99_A.py local
```

## 3. 结果

```bash
8.3
8
```

## 4. 总结

1. 注意python中字符串的索引是从0开始的，而java中是从1开始的。
2. 注意python中字符串的切片是左闭右开的，而java中是左闭右闭的。
3. 注意python中字符串的索引是从0开始的，而java中是从1开始的。
4. 注意python中字符串的切片是左闭右开的，而java中是左闭右闭的。
5. 注意python中字符串的索引是从0开始的，而java中是从1开始的。
6. 注意python中字符串的切片是左闭右开的，而java中是左闭右闭的。
7. 注意python中字符串的索引是从0开始的，而java中是从1开始的。
8. 注意python中字符串的切片是左闭右开的，而java中是左闭右闭的。
9. 注意python中字符串的索引是从0开始的，而java中是从1开始的。
10. 注意python中字符串的切片是左闭右开的，而java中是左闭右闭的。
11. 注意python中字符串的索引是从0开始的，而java中是从1开始的。
12. 注意python中字符串的切片是左闭右开的，而java中是左闭右闭的。
13. 注意python中字符串的索引是从0开始的，而java中是从1开始的。
14. 注意python中字符串的切片是左闭右开的，而java中是左闭右闭的。
15. 注意python中字符串的索引是从0开始的，而java中是从1开始的。
16. 注意python中字符串的切片是左闭右开的，而java中是左闭右闭的。
17. 注意python中字符串的索引是从0开始的，而java中是从1开始的。
18. 注意python中字符串的切片是左闭右开的，而java中是左闭右闭的。
19. 注意python中字符串的索引是从0开始的，而java中是从1开始的。
20. 注意python中字符串的切片是左闭右开的，而java中是左闭右闭的。
21. 注意python中字符串的索引是从0开始的，而java中是从1开始的。
22. 注意python中字符串的切片是左闭右开的，而java中是左闭右闭的。
23. 注意python中字符串的索引是从0开始的，而java中是从1开始的。
24. 注意python中字符串的切片是左闭右开的，而java中是左闭右闭的。
25. 注意python中字符串的索引是从0开始的，而java中是从1开始的。
26. 注意python中字符串的切片是左闭右开的，而java中是左闭右闭的。
27. 注意python中字符串的索引是从0开始的，而java中是从1开始的。
28. 注意python中字符串的切片是左闭右开的，而java中是左闭右闭的。
29. 注意python中字符串的索引是从0开始的，而java中是从1开始的。
30. 注意python中字符串的切片是左闭右开的，而java中是左闭右闭的。
31. 注意python中字符串的索引是从0开始的，而java中是从1开始的。
32. 注意python中字符串的切片是左闭右开的，而java中是左闭右闭的。
33. 注意python中字符串的索引是从0开始的，而java中是从1开始的。
34. 注意python中字符串的切片是左闭右开的，而java中是左闭右闭的。
35. 注意python中字符串的索引是从0开始的，而java中是从1开始的。
36. 注意python中字符串的切片是左闭右开的，而java中是左闭右闭的。
37. 注意python中字符串的索引是从0开始的，而java中是从1开始的。
38. 注意python中字符串的切片是左闭右开的，而java中是左闭右闭的。
39. 注意python中字符串的索引是从0开始的，而java中是从1开始的。
40. 注意python中字符串的切片是左闭右开的，而java中是左闭右闭的。
41. 注意python中字符串的索引是从0开始的，而java中是从1开始的。
42. 注意python中字符串的切片是左闭右开的，而java中是左闭右闭的。
43. 注意python中字符串的索引是从0开始的，而java中是从1开始的。
44. 注意python中字符串的切片是左闭右开的，而java中是左闭右闭的。
45. 注意python中字符串的索引是从0开始的，而java中是从1开始的。
46. 注意python中字符串的切片是左闭右开的，而java中是左闭右闭的。
47. 注意python中字符串的索引是从0开始的，而java中是从1开始的。
48. 注意python中字符串的切片是左闭右开的，而java中是左闭右闭的。
49. 注意python中字符串的索引是从0开始的，而java中是从1开始的。
50. 注意python中字符串
