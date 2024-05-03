def f(text, search_string):
    indexes = []	## <state>indexes = CLRJ</state>
    while search_string in text:	## <state>search_string = CLRJ | text = CLRJ</state>
        indexes.append(text.rindex(search_string))	## <state>indexes = CLRJ | text = CLRJ | search_string = CLRJ</state>
        text = text[:text.rindex(search_string)]	## <state>text = CLRJ | search_string = CLRJ</state>
    return indexes	## <state>indexes = CLRJ</state>
