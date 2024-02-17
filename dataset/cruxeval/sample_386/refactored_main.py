concat = 'mid'
di = {'0':'q','1':'f','2':'w','3':'i'}
count = len(di)
for i in range(count):
    if di.get(str(i)) in concat:
        di.pop(str(i))
print("Done!")