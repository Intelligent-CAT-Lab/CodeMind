def f(instagram, imgur, wins):
    photos = [instagram, imgur]
    if instagram == imgur:
        return wins
    if wins == 1:
        return photos.pop()
    else:
        photos.reverse()
        return photos.pop()
f(['sdfs', 'drcr', '2e'], ['sdfs', 'dr2c', 'QWERTY'], 0)