def f(text, search_chars, replace_chars):
    trans_table = str.maketrans(search_chars, replace_chars)	## <state>trans_table = CLRJ | search_chars = CLRJ | replace_chars = CLRJ</state>
    return text.translate(trans_table)	## <state>text = CLRJ | trans_table = CLRJ</state>
