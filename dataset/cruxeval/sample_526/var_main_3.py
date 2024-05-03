def f(label1, char, label2, index):
    m = label1.rindex(char)	## <state>m = CLRJ | label1 = CLRJ | char = CLRJ</state>
    if m >= index:	## <state>m = CLRJ | index = CLRJ</state>
        return label2[:m - index + 1]	## <state>label2 = CLRJ | m = CLRJ | index = CLRJ</state>
    return label1 + label2[index - m - 1:]