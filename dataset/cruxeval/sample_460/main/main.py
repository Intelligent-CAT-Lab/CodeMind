def f(text, amount):
    length = len(text)
    pre_text = '|'
    if amount >= length:
        extra_space = amount - length
        pre_text += ' ' * (extra_space // 2)
        return pre_text + text + pre_text
    return text