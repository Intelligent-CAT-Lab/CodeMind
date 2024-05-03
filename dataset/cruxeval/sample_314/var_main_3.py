def f(text):
    if ',' in text:	## <state>text = CLRJ</state>
        before, _, after = text.partition(',')	## <state>before = CLRJ | _ = CLRJ | after = CLRJ | text = CLRJ</state>
        return after + ' ' + before	## <state>after = CLRJ | before = CLRJ</state>
    return ',' + text.partition(' ')[-1] + ' 0'