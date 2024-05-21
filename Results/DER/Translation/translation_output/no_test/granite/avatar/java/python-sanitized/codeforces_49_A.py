import re

question = input().strip()
original_q = re.sub(r'[^a-zA-Z]', '', question)
ch = original_q[-1]
vowels = ['A', 'E', 'I', 'O', 'U', 'Y']

if any(vowel.lower() == ch.lower() for vowel in vowels):
    print("YES")
else:
    print("NO")