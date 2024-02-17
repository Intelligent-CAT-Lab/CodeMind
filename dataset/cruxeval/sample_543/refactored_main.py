item = '.,,,,,. منبت'
modified = item.replace('. ', ' , ').replace('&#33; ', '! ').replace('. ', '? ').replace('. ', '. ')
print(modified[0].upper() + modified[1:])