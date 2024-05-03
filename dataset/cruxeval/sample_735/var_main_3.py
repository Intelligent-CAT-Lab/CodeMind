def f(sentence):
    if sentence == '':	## <state>sentence = CLRJ</state>
        return ''
    sentence = sentence.replace('(', '')	## <state>sentence = CLRJ</state>
    sentence = sentence.replace(')', '')	## <state>sentence = CLRJ</state>
    return sentence.capitalize().replace(' ', '')	## <state>sentence = CLRJ</state>
