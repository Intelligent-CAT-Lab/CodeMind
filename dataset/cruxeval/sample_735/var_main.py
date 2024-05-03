def f(sentence):
    if sentence == '':	## {"sentence" : ''}
        return ''
    sentence = sentence.replace('(', '')	## {"sentence" : ''}
    sentence = sentence.replace(')', '')	## {"sentence" : ''}
    return sentence.capitalize().replace(' ', '')	## {"sentence" : ''}
