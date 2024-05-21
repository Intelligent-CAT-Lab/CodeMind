s = input()
c = sum(int(digit) for digit in s)
if c % 9 == 0:
    print("Yes")
else:
    print("No")