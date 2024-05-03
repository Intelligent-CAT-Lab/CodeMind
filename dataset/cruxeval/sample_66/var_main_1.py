def f(text, prefix):
    prefix_length = len(prefix)	## prefix_length = CLRJ | prefix = CLRJ
    if text.startswith(prefix):	## text = CLRJ | prefix = CLRJ
        return text[(prefix_length - 1) // 2:	## text = CLRJ | prefix_length = CLRJ
                    (prefix_length + 1) // 2 * -1:-1]	## prefix_length = CLRJ
    else:
        return text