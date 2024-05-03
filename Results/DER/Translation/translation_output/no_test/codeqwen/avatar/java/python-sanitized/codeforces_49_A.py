import re

question = input().strip()
original_q = question[:-1].strip()
ch = original_q[-1]
vowels = ["A", "E", "I", "O", "U", "Y"]

if ch.upper() in vowels:
    print("YES")
else:
    print("NO")