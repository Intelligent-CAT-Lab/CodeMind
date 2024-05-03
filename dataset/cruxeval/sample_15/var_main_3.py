def f(text, wrong, right):
    new_text = text.replace(wrong, right)	## <state>new_text = CLRJ | text = CLRJ | wrong = CLRJ | right = CLRJ</state>
    return new_text.upper()	## <state>new_text = CLRJ</state>
