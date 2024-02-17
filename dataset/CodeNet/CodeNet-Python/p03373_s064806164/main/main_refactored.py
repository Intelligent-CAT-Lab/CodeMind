class main:
	A, B, C, X, Y = list(map(int, input().split()))
	# 個別に買う
	v1 = A * X + B * Y
	# 少ない方に合わせてセットを買い、足りない分を買い足す
	if X >= Y:
	    v2 = C * 2 * Y + (X - Y) * A
	else:
	    v2 = C * 2 * X + (Y - X) * B
	# すべてセットで買う
	v3 = C * 2 * max([X, Y])
	print((min([v1, v2, v3])))
