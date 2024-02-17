s = 'aphid'
from_c = 'i'
to_c = '?'
table = s.maketrans(from_c, to_c)
print(s.translate(table))