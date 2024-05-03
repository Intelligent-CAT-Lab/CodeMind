def f(album_sales):
    while len(album_sales) != 1:	## <state>album_sales = CLRJ</state>
        album_sales.append(album_sales.pop(0))
    return album_sales[0]	## <state>album_sales = CLRJ</state>
