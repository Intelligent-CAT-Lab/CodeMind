def f(text, char):
    char_index = text.find(char)	## char_index = CLRJ | text = CLRJ | char = CLRJ
    result = []	## result = CLRJ
    if char_index > 0:	## char_index = CLRJ
        result = list(text[:char_index])
    result.extend(list(char)+list(text[char_index+len(char):]))	## result = CLRJ | char = CLRJ | text = CLRJ | char_index = CLRJ
    return ''.join(result)	## result = CLRJ
