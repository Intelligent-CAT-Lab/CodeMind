text = "wys silak v5 e4fi rotbi fwj 78 wigf t8s lcl"
m = 0
cnt = 0
for i in text.split():
    if len(i) > m:
        cnt += 1
        m = len(i)
print(cnt)