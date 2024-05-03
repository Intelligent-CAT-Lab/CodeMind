def f(text):
    result = ''	## result = CLRJ
    for char in text:	## char = CLRJ | text = CLRJ
        if char.isalnum():	## char = CLRJ
            result += char.upper()	## result = CLRJ | char = CLRJ
    return result	## result = CLRJ
