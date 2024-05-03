def f(item):
    modified = item.replace('. ', ' , ').replace('&#33; ', '! ').replace('. ', '? ').replace('. ', '. ')	## {"modified" : '',"item" : ''}
    return modified[0].upper() + modified[1:]	## {"modified" : ''}
