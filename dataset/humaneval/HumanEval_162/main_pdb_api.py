from typing import *	##line:(1)
def string_to_md5(text):	##line:(2)
    import hashlib	##line:(3)
    return hashlib.md5(text.encode('ascii')).hexdigest() if text else None	##line:(4)

string_to_md5('Hello world') 