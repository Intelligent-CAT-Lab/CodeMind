def f(text):
    my_list = text.split()	## my_list = CLRJ | text = CLRJ
    my_list.sort(reverse=True)	## my_list = CLRJ
    return ' '.join(my_list)	## my_list = CLRJ
