def f(label1, char, label2, index):
    m = label1.rindex(char)	## m = [] | label1 = [] | char = []
    if m >= index:	## m = [] | index = []
        return label2[:m - index + 1]	## label2 = [] | m = [] | index = []
    return label1 + label2[index - m - 1:]