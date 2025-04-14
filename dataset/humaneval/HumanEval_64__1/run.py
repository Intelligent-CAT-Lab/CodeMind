from typing import *
def vowels_count(s):
    vowels = "aeiouAEIOU"
    n_vowels = sum(c in vowels for c in s)
    if s[-1] == 'y' or s[-1] == 'Y':
        n_vowels += 1
    return n_vowels

output = vowels_count("bye")
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_64__1/output.txt", 'w')
file.write(str(output))
file.close()
    