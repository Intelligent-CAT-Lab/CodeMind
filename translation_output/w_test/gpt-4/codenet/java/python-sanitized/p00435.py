s = input()
output = "".join([chr((ord(c) - 42) % 26 + 65) for c in s])
print(output)