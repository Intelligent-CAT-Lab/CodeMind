from typing import *
def encode(message):
    vowels = "aeiouAEIOU"
    vowels_replace = dict([(i, chr(ord(i) + 2)) for i in vowels])
    message = message.swapcase()
    return ''.join([vowels_replace[i] if i in vowels else i for i in message])

output = encode("I DoNt KnOw WhAt tO WrItE")
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_93__1/output.txt", 'w')
file.write(str(output))
file.close()
    