# -*- coding: utf-8 -*-
[A, B] = [int(i) for i in "12 4".split()]
diff = A - B * 2
if diff < 0:
    print(0)
else:
    print(diff)