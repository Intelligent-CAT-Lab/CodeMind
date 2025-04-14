from typing import *
def string_to_md5(text):
    import hashlib
    return hashlib.md5(text.encode('ascii')).hexdigest() if text else None

output = string_to_md5('Hello world') 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_162/output.txt", 'w')
file.write(str(output))
file.close()
    