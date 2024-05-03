def f(arr):
    n = [item for item in arr if item%2 == 0]	## n = [] | item = [] | arr = []
    m = n+arr	## m = [] | n = [] | arr = []
    for i in m:	## i = [] | m = []
        if m.index(i) >= len(n):	## m = [] | i = [] | n = []
            m.remove(i)	## m = [] | i = []
    return m	## m = []
