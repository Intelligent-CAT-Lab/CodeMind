# -*- coding: utf-8 -*-
from collections import Counter
s = list("abac")
c = Counter(s)
c = [c["a"], c["b"], c["c"]]
if max(c)-min(c)<2:
    print("YES")
else:
    print("NO")
