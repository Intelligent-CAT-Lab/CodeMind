def f(book):
    a = book.rsplit(':', 1)	## a = CLRJ | book = CLRJ
    if a[0].split(' ')[-1] == a[1].split(' ')[0]:	## a = CLRJ
        return f(' '.join(a[0].split(' ')[:-1]) + ' ' + a[1])
    return book	## book = CLRJ
