def f(text):
    if ',' in text:	## text = CLRJ
        before, _, after = text.partition(',')	## before = CLRJ | _ = CLRJ | after = CLRJ | text = CLRJ
        return after + ' ' + before	## after = CLRJ | before = CLRJ
    return ',' + text.partition(' ')[-1] + ' 0'