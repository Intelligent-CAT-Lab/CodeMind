class main:
	print(('Hom' if len(list(i for i in map(int, input().split()) if i % 2 == 1)) >= 2 else 'Tem'))
	
