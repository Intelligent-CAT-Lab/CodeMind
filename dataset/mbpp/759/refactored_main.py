num = '123.11'
import re
dnumre = re.compile(r"""^[0-9]+(\.[0-9]{1,2})?$""")
result = dnumre.search(num)
print(bool(result))