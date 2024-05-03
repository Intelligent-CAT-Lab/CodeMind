def f(text, to_remove):
    new_text = list(text)	## <state>new_text = CLRJ | text = CLRJ</state>
    if to_remove in new_text:	## <state>to_remove = CLRJ | new_text = CLRJ</state>
        index = new_text.index(to_remove)	## <state>index = CLRJ | new_text = CLRJ | to_remove = CLRJ</state>
        new_text.remove(to_remove)	## <state>new_text = CLRJ | to_remove = CLRJ</state>
        new_text.insert(index, '?')	## <state>new_text = CLRJ | index = CLRJ</state>
        new_text.remove('?')	## <state>new_text = CLRJ</state>
    return ''.join(new_text)	## <state>new_text = CLRJ</state>
