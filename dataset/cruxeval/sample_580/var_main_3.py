def f(text, char):
    new_text = text	## <state>new_text = CLRJ | text = CLRJ</state>
    a = []	## <state>a = CLRJ</state>
    while char in new_text:	## <state>char = CLRJ | new_text = CLRJ</state>
        a.append(new_text.index(char))	## <state>a = CLRJ | new_text = CLRJ | char = CLRJ</state>
        new_text = new_text.replace(char,"",1)	## <state>new_text = CLRJ | char = CLRJ</state>
    return a	## <state>a = CLRJ</state>
