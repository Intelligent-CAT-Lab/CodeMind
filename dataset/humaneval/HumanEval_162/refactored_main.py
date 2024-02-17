text = 'Hello world'
import hashlib
print(hashlib.md5(text.encode('ascii')).hexdigest() if text else None)