no = ['l', 'f', 'h', 'g', 's', 'b']
d = dict.fromkeys(no, False) 
print(sum([1 for i in d.keys()]))