from typing import *
def string_to_md5(text):
    import hashlib
    return hashlib.md5(text.encode('ascii')).hexdigest() if text else None

output = string_to_md5('')
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_162__0/output.txt", 'w')
file.write(str(output))
file.close()
    