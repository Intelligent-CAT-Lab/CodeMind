def f(sentence):
    if sentence == '':	## sentence = CLRJ
        return ''
    sentence = sentence.replace('(', '')	## sentence = CLRJ
    sentence = sentence.replace(')', '')	## sentence = CLRJ
    return sentence.capitalize().replace(' ', '')	## sentence = CLRJ
