def f(sentences):
    if all([sentence.isdecimal() for sentence in sentences.split('.')]):
        return 'oscillating' 
    else:
        return 'not oscillating'