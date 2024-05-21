import re

def compute(S):
    for i in range(26):
        converted = ""
        for j in range(len(S)):
            c = S[j]
            if c.isalpha():
                converted += chr((ord(c) - ord('a') + i) % 26 + ord('a'))
            else:
                converted += c
        if re.search(r"the|this|that", converted):
            return converted

test_input = "xlmw mw xli tmgxyvi xlex m xsso mr xli xvmt."
print(compute(test_input))