n = 'iq'
length = len(n) + 2
revn = list(n)
result = ''.join(revn)
revn.clear()
print(result + ('!' * length))