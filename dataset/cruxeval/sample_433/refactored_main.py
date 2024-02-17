text = "Dmreh,Sspp,T,G ,.tB,Vxk,Cct"
text = text.split(',')
text.pop(0)
text.insert(0, text.pop(text.index('T')))
print('T' + ',' + ','.join(text))