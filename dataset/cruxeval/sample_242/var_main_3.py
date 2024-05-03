def f(book):
    a = book.rsplit(':', 1)	## <state>a = CLRJ | book = CLRJ</state>
    if a[0].split(' ')[-1] == a[1].split(' ')[0]:	## <state>a = CLRJ</state>
        return f(' '.join(a[0].split(' ')[:-1]) + ' ' + a[1])
    return book	## <state>book = CLRJ</state>
