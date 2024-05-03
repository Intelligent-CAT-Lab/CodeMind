def f(book):
    a = book.rsplit(':', 1)	## a = [] | book = []
    if a[0].split(' ')[-1] == a[1].split(' ')[0]:	## a = []
        return f(' '.join(a[0].split(' ')[:-1]) + ' ' + a[1])
    return book	## book = []
