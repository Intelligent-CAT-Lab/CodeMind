import re

vowels = ['A', 'E', 'I', 'O', 'U', 'Y']

question = input().strip()
originalQ = question[:-1].strip()
ch = originalQ[-1]

b = any(re.match(f'^{vowel}$', ch, re.IGNORECASE) for vowel in vowels)
print('YES' if b else 'NO')