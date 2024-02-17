class main:
	def dfs(game):
	    a,b = game.count("A"),game.count("B")
	    if  (a == 5 and b < 4 or a < 4 and b == 5 or a == b == 5 or 
	            a == 6 and b == 4 or a == 4 and b == 6):
	        possible.add(game)
	    elif (max(a,b) <= 4 or a == b == 4 or a == 5 and b == 4 or a == 4 and b == 5):
	        possible.add(game)
	        if game+"A" not in possible: dfs(game+"A")
	        if game+"B" not in possible: dfs(game+"B")
	            
	j,y = list(map(int,input().split()))
	possible = set([])
	dfs("")
	ans = []
	for game in possible:
	    if (game.count("A"),game.count("B")) == (j,y): ans.append(game)
	print("\n".join(sorted(ans)))