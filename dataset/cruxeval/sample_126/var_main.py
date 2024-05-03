def f(text):
    s = text.rpartition('o')	## {"s" : '',"text" : ''}
    div, div2 = (s[0] == '' and '-' or s[0]), (s[2] == '' and '-' or s[2])	## {"div" : '',"div2" : '',"s" : ''}
    return s[1] + div + s[1] + div2	## {"s" : '',"div" : '',"div2" : ''}
