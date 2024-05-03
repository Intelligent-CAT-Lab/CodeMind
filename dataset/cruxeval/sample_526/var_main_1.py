def f(label1, char, label2, index):
    m = label1.rindex(char)	## m = CLRJ | label1 = CLRJ | char = CLRJ
    if m >= index:	## m = CLRJ | index = CLRJ
        return label2[:m - index + 1]	## label2 = CLRJ | m = CLRJ | index = CLRJ
    return label1 + label2[index - m - 1:]