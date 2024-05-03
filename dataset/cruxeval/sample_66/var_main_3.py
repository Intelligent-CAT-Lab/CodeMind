def f(text, prefix):
    prefix_length = len(prefix)	## <state>prefix_length = CLRJ | prefix = CLRJ</state>
    if text.startswith(prefix):	## <state>text = CLRJ | prefix = CLRJ</state>
        return text[(prefix_length - 1) // 2:	## <state>text = CLRJ | prefix_length = CLRJ</state>
                    (prefix_length + 1) // 2 * -1:-1]	## <state>prefix_length = CLRJ</state>
    else:
        return text