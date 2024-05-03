def f(item):
    modified = item.replace('. ', ' , ').replace('&#33; ', '! ').replace('. ', '? ').replace('. ', '. ')	## modified = CLRJ | item = CLRJ
    return modified[0].upper() + modified[1:]	## modified = CLRJ
