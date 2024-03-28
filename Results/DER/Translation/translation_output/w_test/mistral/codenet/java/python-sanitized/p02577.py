s = input()
c = sum(int(char) - 48 for char in s)
if c % 9 == 0:
    print("Yes")
else:
    print("No")