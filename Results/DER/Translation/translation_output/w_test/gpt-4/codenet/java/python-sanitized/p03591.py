# Your sample test case is provided below:
# Test input: YAKINIKU
# Expected output: Yes

s = input().strip()

if len(s) < 4:
    print("No")
else:
    s2 = s[:4]
    if s2 == "YAKI":
        print("Yes")
    else:
        print("No")