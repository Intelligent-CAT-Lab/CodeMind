items = "qy. dg. rnvprt rse.. irtwv tx.."
target = "wtwdoacb"
for i in items.split():
    if i in target:
        print(items.index(i)+1)
        break
    if i.index('.') == len(i)-1 or i.index('.') == 0:
        print('error')
        break
else:
    print('.')