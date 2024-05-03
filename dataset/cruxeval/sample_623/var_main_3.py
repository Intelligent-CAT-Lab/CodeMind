def f(text, rules):
    for rule in rules:	## <state>rule = CLRJ | rules = CLRJ</state>
        if rule == '@':	## <state>rule = CLRJ</state>
            text = text[::-1]
        elif rule == '~':	## <state>rule = CLRJ</state>
            text = text.upper()	## <state>text = CLRJ</state>
        elif text and text[len(text)-1] == rule:	## <state>text = CLRJ | rule = CLRJ</state>
            text = text[0:len(text)-1]	## <state>text = CLRJ</state>
    return text	## <state>text = CLRJ</state>
