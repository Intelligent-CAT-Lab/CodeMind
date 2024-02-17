n = 0
l = ['aaa', 'bbb']
archive = {}
for _ in range(n):
    archive.clear()
    archive.update({x + 10: x * 10 for x in l})
print(archive)