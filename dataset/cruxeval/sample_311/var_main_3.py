def f(text):
    text = text.replace('#', '1').replace('$', '5')	## <state>text = CLRJ</state>
    return 'yes' if text.isnumeric() else 'no'	## <state>text = CLRJ</state>
