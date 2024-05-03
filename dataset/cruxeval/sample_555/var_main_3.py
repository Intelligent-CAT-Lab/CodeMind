def f(text, tabstop):
    text = text.replace('\n', '_____')	## <state>text = CLRJ</state>
    text = text.replace('\t', tabstop * ' ')	## <state>text = CLRJ | tabstop = CLRJ</state>
    text = text.replace('_____', '\n')	## <state>text = CLRJ</state>
    return text	## <state>text = CLRJ</state>
