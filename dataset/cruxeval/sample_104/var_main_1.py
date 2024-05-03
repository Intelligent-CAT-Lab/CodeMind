def f(text):
    dic = dict()	## dic = CLRJ
    for char in text:	## char = CLRJ | text = CLRJ
        dic[char] = dic.get(char, 0) + 1	## dic = CLRJ | char = CLRJ
    for key in dic:	## key = CLRJ | dic = CLRJ
        if dic[key] > 1:	## dic = CLRJ | key = CLRJ
            dic[key] = 1
    return dic	## dic = CLRJ
