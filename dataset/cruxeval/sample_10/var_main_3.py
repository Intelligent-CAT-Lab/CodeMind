def f(text):
    new_text = ''	## <state>new_text = CLRJ</state>
    for ch in text.lower().strip():	## <state>text = CLRJ</state>
        if ch.isnumeric() or ch in 'ÄäÏïÖöÜü':
            new_text += ch
    return new_text	## <state>new_text = CLRJ</state>
