d = {'i': 1, 'love': 'parakeets'}
r = {
    'c': d.copy(),
    'd': d.copy()
}
print((r['c'] is r['d'], r['c'] == r['d']))