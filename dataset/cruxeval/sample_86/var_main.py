def f(instagram, imgur, wins):
    photos = [instagram, imgur]	## {"photos" : '',"instagram" : '',"imgur" : ''}
    if instagram == imgur:	## {"instagram" : '',"imgur" : ''}
        return wins
    if wins == 1:	## {"wins" : ''}
        return photos.pop()
    else:
        photos.reverse()	## {"photos" : ''}
        return photos.pop()	## {"photos" : ''}
