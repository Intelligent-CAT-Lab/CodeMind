def f(text):
    dic = dict()	## <state>dic = CLRJ</state>
    for char in text:	## <state>char = CLRJ | text = CLRJ</state>
        dic[char] = dic.get(char, 0) + 1	## <state>dic = CLRJ | char = CLRJ</state>
    for key in dic:	## <state>key = CLRJ | dic = CLRJ</state>
        if dic[key] > 1:	## <state>dic = CLRJ | key = CLRJ</state>
            dic[key] = 1
    return dic	## <state>dic = CLRJ</state>
