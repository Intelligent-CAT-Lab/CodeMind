def f(text):
    my_list = text.split()
    my_list.sort(reverse=True)
    return ' '.join(my_list)