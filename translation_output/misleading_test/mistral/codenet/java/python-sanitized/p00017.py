import re

def compute():
    with open('input.txt', 'r') as f:
        for line in f:
            line = line.strip()
            for i in range(26):
                converted = ""
                for char in line:
                    if char.isalpha():
                        if char.islower() and char + i <= 'z':
                            converted += chr(ord(char) + i)
                        else:
                            converted += chr(ord(char) + i - 26)
                    else:
                        converted += char
                if 'the' in converted or 'this' in converted or 'that' in converted:
                    print(converted)
                    break

compute()