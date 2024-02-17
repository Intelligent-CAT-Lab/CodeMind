text = 'GENERAL NAGOOR'
amount = 5
length = len(text)
pre_text = '|'
if amount >= length:
    extra_space = amount - length
    pre_text += ' ' * (extra_space // 2)
    print(pre_text + text + pre_text)
else:
    print(text)