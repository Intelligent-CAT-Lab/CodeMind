import re

def compute(string):
    for i in range(26):
        converted = ""
        for char in string:
            if char.isalpha():
                converted += chr((ord(char) + i - 97) % 26 + 97)
            else:
                converted += char
        if "the" in converted or "this" in converted or "that" in converted:
            return converted
    return None

string = "xlmw mw xli tmgxyvi xlex m xsso mr xli xvmt."
print(compute(string))