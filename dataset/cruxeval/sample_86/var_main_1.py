def f(instagram, imgur, wins):
    photos = [instagram, imgur]	## photos = CLRJ | instagram = CLRJ | imgur = CLRJ
    if instagram == imgur:	## instagram = CLRJ | imgur = CLRJ
        return wins
    if wins == 1:	## wins = CLRJ
        return photos.pop()
    else:
        photos.reverse()	## photos = CLRJ
        return photos.pop()	## photos = CLRJ
