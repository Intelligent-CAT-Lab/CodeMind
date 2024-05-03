def is_nested(string):
    opening_bracket_index = []	## opening_bracket_index = CLRJ
    closing_bracket_index = []	## closing_bracket_index = CLRJ
    for i in range(len(string)):	## i = CLRJ|string = CLRJ
        if string[i] == '[':	## string = CLRJ|i = CLRJ
            opening_bracket_index.append(i)	## opening_bracket_index = CLRJ|i = CLRJ
        else:
            closing_bracket_index.append(i)	## closing_bracket_index = CLRJ|i = CLRJ
    closing_bracket_index.reverse()	## closing_bracket_index = CLRJ
    cnt = 0	## cnt = CLRJ
    i = 0	## i = CLRJ
    l = len(closing_bracket_index)	## l = CLRJ|closing_bracket_index = CLRJ
    for idx in opening_bracket_index:	## idx = CLRJ|opening_bracket_index = CLRJ
        if i < l and idx < closing_bracket_index[i]:	## i = CLRJ|l = CLRJ|idx = CLRJ|closing_bracket_index = CLRJ
            cnt += 1	## cnt = CLRJ
            i += 1	## i = CLRJ
    return cnt >= 2	## cnt = CLRJ

    
