def f(text):
    my_list = text.split()	## {"my_list" : '',"text" : ''}
    my_list.sort(reverse=True)	## {"my_list" : ''}
    return ' '.join(my_list)	## {"my_list" : ''}
