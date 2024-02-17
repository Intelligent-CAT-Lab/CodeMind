class main:
	#!/usr/bin/env python3
	import sys
	
	def main():
	    input = sys.stdin.readline
	    k = int(eval(input()))
	    if k % 10 in [0, 2, 4, 5, 6, 8]:
	        print((-1))
	    elif k % 10 == 1:
	        tmp = k * 7
	        ans = 1
	        while True:
	            if str(tmp).count("7") == len(str(tmp)):
	                print((ans + len(str(tmp)) - 1))
	                break
	            if tmp // 10 % 10 <= 7:
	                num = 7 - tmp // 10 % 10
	            elif tmp // 10 % 10 == 8:
	                num = 9
	            elif tmp // 10 % 10 == 9:
	                num = 8
	            tmp2 = k * num
	            tmp = tmp // 10 + tmp2
	            ans += 1
	            if ans > k:
	                print((-1))
	                break
	    elif k % 10 == 3:
	        tmp = k * 9
	        ans = 1
	        while True:
	            if str(tmp).count("7") == len(str(tmp)):
	                print((ans + len(str(tmp)) - 1))
	                break
	            num = ((tmp // 10 % 10) * 3 - 1) % 10
	            tmp2 = k * num
	            tmp = tmp // 10 + tmp2
	            ans += 1
	            if ans > k:
	                print((-1))
	                break
	    elif k % 10 == 7:
	        tmp = k * 1
	        ans = 1
	        while True:
	            if str(tmp).count("7") == len(str(tmp)):
	                print((ans + len(str(tmp)) - 1))
	                break
	            num = ((tmp // 10 % 10) * 7 + 1) % 10
	            tmp2 = k * num
	            tmp = tmp // 10 + tmp2
	            ans += 1
	            if ans > k:
	                print((-1))
	                break
	    elif k % 10 == 9:
	        tmp = k * 3
	        ans = 1
	        while True:
	            if str(tmp).count("7") == len(str(tmp)):
	                print((ans + len(str(tmp)) - 1))
	                break
	            num = ((tmp // 10 % 10) + 3) % 10
	            tmp2 = k * num
	            tmp = tmp // 10 + tmp2
	            ans += 1
	            if ans > k:
	                print((-1))
	                break
	
	if __name__ == '__main__':
	    main()
