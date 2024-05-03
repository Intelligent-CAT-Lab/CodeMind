def f(text):
    for punct in '!.?,:;':	## <state>punct = CLRJ</state>
        if text.count(punct) > 1:	## <state>text = CLRJ | punct = CLRJ</state>
            return 'no'
        if text.endswith(punct):	## <state>text = CLRJ | punct = CLRJ</state>
            return 'no'
    return text.title()	## <state>text = CLRJ</state>
