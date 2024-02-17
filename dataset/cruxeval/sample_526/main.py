def f(label1, char, label2, index):
    m = label1.rindex(char)
    if m >= index:
        return label2[:m - index + 1]
    return label1 + label2[index - m - 1:]