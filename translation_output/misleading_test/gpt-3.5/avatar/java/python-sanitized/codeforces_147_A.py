def isLatinLetter(c):
    return 'a' <= c <= 'z'

def iscodeforces_147_A(c):
    return c in ['.', ',', '!', '?']

s = input()
output = []
for i, char in enumerate(s):
    if i == 0 or (char.isalpha() and not s[i-1].isalpha()):
        output.append(char)
    elif iscodeforces_147_A(char):
        output.append(char)
    else:
        output[-1] += char

result = ' '.join(output)
print(result)