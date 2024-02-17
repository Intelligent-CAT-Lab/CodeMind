book = "udhv zcvi nhtnfyd :erwuyawa pun"
a = book.rsplit(':', 1)
while a[0].split(' ')[-1] == a[1].split(' ')[0]:
    book = ' '.join(a[0].split(' ')[:-1]) + ' ' + a[1]
    a = book.rsplit(':', 1)
print(book)