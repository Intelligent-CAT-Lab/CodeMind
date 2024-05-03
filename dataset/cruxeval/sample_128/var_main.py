def f(text):
    odd = ''	## {"odd" : ''}
    even = ''	## {"even" : ''}
    for i, c in enumerate(text):	## {"i" : '',"c" : '',"text" : ''}
        if i % 2 == 0:	## {"i" : ''}
            even += c	## {"even" : '',"c" : ''}
        else:
            odd += c	## {"odd" : '',"c" : ''}
    return even + odd.lower()	## {"even" : '',"odd" : ''}
