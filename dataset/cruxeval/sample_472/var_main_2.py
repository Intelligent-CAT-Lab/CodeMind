def f(text):
    d = {}	## d = []
    for char in text.replace('-', '').lower():	## char = [] | text = []
        d[char] = d[char] + 1 if char in d else 1	## d = [] | char = []
    d = sorted(d.items(), key=lambda x: x[1])	## d = [] | x = []
    return [val for i, val in d]	## val = [] | i = [] | d = []
