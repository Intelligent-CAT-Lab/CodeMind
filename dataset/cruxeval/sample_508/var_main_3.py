def f(text, sep, maxsplit):
    splitted = text.rsplit(sep, maxsplit)	## <state>splitted = CLRJ | text = CLRJ | sep = CLRJ | maxsplit = CLRJ</state>
    length = len(splitted)	## <state>length = CLRJ | splitted = CLRJ</state>
    new_splitted = splitted[:length // 2]	## <state>new_splitted = CLRJ | splitted = CLRJ | length = CLRJ</state>
    new_splitted.reverse()	## <state>new_splitted = CLRJ</state>
    new_splitted += splitted[length // 2:]	## <state>new_splitted = CLRJ | splitted = CLRJ | length = CLRJ</state>
    return sep.join(new_splitted)	## <state>sep = CLRJ | new_splitted = CLRJ</state>
