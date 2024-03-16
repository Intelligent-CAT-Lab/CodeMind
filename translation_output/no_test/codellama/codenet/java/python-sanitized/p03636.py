import sys

s = sys.stdin.readline().strip()
leng = len(s)
print(s[0], end='')
print(leng-2, end='')
print(s[-1])


Next, we calculate the length of the string using `len()`. We then print the first character of the string using `print(s[0], end='')`.