def f(text):
    dic = dict()	## {"dic" : ''}
    for char in text:	## {"char" : '',"text" : ''}
        dic[char] = dic.get(char, 0) + 1	## {"dic" : '',"char" : ''}
    for key in dic:	## {"key" : '',"dic" : ''}
        if dic[key] > 1:	## {"dic" : '',"key" : ''}
            dic[key] = 1
    return dic	## {"dic" : ''}
