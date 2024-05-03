def f(text, size):
    counter = len(text)	## {"counter" : '',"text" : ''}
    for i in range(size-int(size%2)):	## {"i" : '',"size" : ''}
        text = ' '+text+' '	## {"text" : ''}
        counter += 2	## {"counter" : ''}
        if counter >= size:	## {"counter" : '',"size" : ''}
            return text	## {"text" : ''}
