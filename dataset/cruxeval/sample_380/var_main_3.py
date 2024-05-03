def f(text, delimiter):
    text = text.rpartition(delimiter)	## <state>text = CLRJ | delimiter = CLRJ</state>
    return text[0] + text[-1]	## <state>text = CLRJ</state>
