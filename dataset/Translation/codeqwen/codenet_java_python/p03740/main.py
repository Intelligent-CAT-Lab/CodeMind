try:
    sc = input()
    print("Brown" if abs(int(sc.split()[0]) - int(sc.split()[1])) <= 1 else "Alice")
except Exception as e:
    print(e)