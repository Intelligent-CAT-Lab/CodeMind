def f(text):
    uppercase_index = text.find('A')	## <state>uppercase_index = CLRJ | text = CLRJ</state>
    if uppercase_index >= 0:	## <state>uppercase_index = CLRJ</state>
        return text[:uppercase_index] + text[text.find('a') + 1 :]
    else:
        return ''.join(sorted(text))	## <state>text = CLRJ</state>
