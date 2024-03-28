class main:
    string = input()
    count = [0]*26
    alphabet = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n',
    		  'o','p','q','r','s','t','u','v','w','x','y','z']
    chars = string.tochararray()
    for i in range(len(chars)):
    	count[ord(chars[i])-97] += 1
    for i in range(len(count)):
    	if count[i] == 0:
    		print(alphabet[i])
    		break
    else:
    	print("None")