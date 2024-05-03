def f(item):
    modified = item.replace('. ', ' , ').replace('&#33; ', '! ').replace('. ', '? ').replace('. ', '. ')	## <state>modified = CLRJ | item = CLRJ</state>
    return modified[0].upper() + modified[1:]	## <state>modified = CLRJ</state>
