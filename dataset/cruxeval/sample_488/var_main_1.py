def f(text, char):
    count = text.count(char)	## count = CLRJ | text = CLRJ | char = CLRJ
    chars = list(text)	## chars = CLRJ | text = CLRJ
    if count > 0:	## count = CLRJ
        index = chars.index(char) + 1	## index = CLRJ | chars = CLRJ | char = CLRJ
        chars[:index:index+1] = [c for c in chars[index:index+count:1]]	## chars = CLRJ | index = CLRJ | c = CLRJ | count = CLRJ
    return ''.join(chars)	## chars = CLRJ
