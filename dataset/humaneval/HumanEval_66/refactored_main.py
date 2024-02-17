s = "You arE Very Smart"
if s == "": print(0)
print(sum(ord(char) if char.isupper() else 0 for char in s))