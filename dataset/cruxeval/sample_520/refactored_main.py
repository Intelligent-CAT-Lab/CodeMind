album_sales = [6]
while len(album_sales) != 1:
    album_sales.append(album_sales.pop(0))
print(album_sales[0])