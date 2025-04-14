from typing import *
def remove_vowels(text):
    return "".join([s for s in text if s.lower() not in ["a", "e", "i", "o", "u"]])

output = remove_vowels('ybcd')
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_51__1/output.txt", 'w')
file.write(str(output))
file.close()
    