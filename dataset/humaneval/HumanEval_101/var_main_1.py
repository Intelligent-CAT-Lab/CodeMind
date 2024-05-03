def words_string(s):
    if not s:	## s = CLRJ
        return []

    s_list = []	## s_list = CLRJ

    for letter in s:	## letter = CLRJ|s = CLRJ
        if letter == ',':	## letter = CLRJ
            s_list.append(' ')	## s_list = CLRJ
        else:
            s_list.append(letter)	## s_list = CLRJ|letter = CLRJ

    s_list = "".join(s_list)	## s_list = CLRJ
    return s_list.split()	## s_list = CLRJ
