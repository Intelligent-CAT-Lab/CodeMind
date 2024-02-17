mylist = [5, 8]
revl = mylist[:]
revl.reverse()
mylist.sort(reverse=True)
print(mylist == revl)