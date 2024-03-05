a=raw_input()
l=len(a)
i=ans=0
while i<l:
	lenj=leno=leni=0
	while i<l and a[i]=="J":
		lenj+=1
		i+=1
	while i<l and a[i]=="O":
		leno+=1
		i+=1
	while i<l and a[i]=="I":
		leni+=1
		i+=1
	if lenj>=leno and leni>=leno:
		ans=max(ans,leno)
print ans