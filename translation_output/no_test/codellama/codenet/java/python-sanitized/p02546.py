import sys

s = input("Enter a word: ")
if s.endswith("s"):
    print(s + "es")
else:
    print(s + "s")