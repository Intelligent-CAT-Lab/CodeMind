def f(text):
    if ',' in text:
        before, _, after = text.partition(',')
        return after + ' ' + before
    return ',' + text.partition(' ')[-1] + ' 0'