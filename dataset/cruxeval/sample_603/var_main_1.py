def f(sentences):
    if all([sentence.isdecimal() for sentence in sentences.split('.')]):	## sentence = CLRJ | sentences = CLRJ
        return 'oscillating' 
    else:
        return 'not oscillating'