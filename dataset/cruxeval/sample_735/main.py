def f(sentence):
    if sentence == '':
        return ''
    sentence = sentence.replace('(', '')
    sentence = sentence.replace(')', '')
    return sentence.capitalize().replace(' ', '')