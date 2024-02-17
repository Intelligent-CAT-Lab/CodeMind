def f(no):
    d = dict.fromkeys(no, False) 
    return sum([1 for i in d.keys()])