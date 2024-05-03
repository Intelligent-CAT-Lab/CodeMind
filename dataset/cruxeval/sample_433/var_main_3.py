def f(text):
    text = text.split(',')	## <state>text = CLRJ</state>
    text.pop(0)	## <state>text = CLRJ</state>
    text.insert(0, text.pop(text.index('T')))	## <state>text = CLRJ</state>
    return 'T' + ',' + ','.join(text)	## <state>text = CLRJ</state>
