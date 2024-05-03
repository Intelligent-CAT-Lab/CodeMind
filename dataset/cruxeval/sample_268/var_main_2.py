def f(s, separator):
    for i in range(len(s)):	## i = [] | s = []
        if s[i] == separator:	## s = [] | i = [] | separator = []
            new_s = list(s)	## new_s = [] | s = []
            new_s[i] = '/'	## new_s = [] | i = []
            return ' '.join(new_s)	## new_s = []
