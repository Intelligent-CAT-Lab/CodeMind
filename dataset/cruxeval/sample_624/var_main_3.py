def f(text, char):
    char_index = text.find(char)	## <state>char_index = CLRJ | text = CLRJ | char = CLRJ</state>
    result = []	## <state>result = CLRJ</state>
    if char_index > 0:	## <state>char_index = CLRJ</state>
        result = list(text[:char_index])
    result.extend(list(char)+list(text[char_index+len(char):]))	## <state>result = CLRJ | char = CLRJ | text = CLRJ | char_index = CLRJ</state>
    return ''.join(result)	## <state>result = CLRJ</state>
