def f(instagram, imgur, wins):
    photos = [instagram, imgur]	## <state>photos = CLRJ | instagram = CLRJ | imgur = CLRJ</state>
    if instagram == imgur:	## <state>instagram = CLRJ | imgur = CLRJ</state>
        return wins
    if wins == 1:	## <state>wins = CLRJ</state>
        return photos.pop()
    else:
        photos.reverse()	## <state>photos = CLRJ</state>
        return photos.pop()	## <state>photos = CLRJ</state>
