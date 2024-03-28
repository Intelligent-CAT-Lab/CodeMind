import sys

n = int(sys.stdin.readline().strip())
s = ""

while n > 0:
    x = n % 2
    n //= 2
    s += str(x) + " "

ans = 0

for i in range(len(s)):
    if s[i] == "1":
        ans += 1

print(ans)


After the while loop, the code uses a for loop to iterate over the characters in the string `s` and count the number of times the character "1" appears. This number is stored in the variable `ans`. Finally, the code prints the value of `ans` to standard output.