def run():
    s = input()
    c = [s.count('K'), s.count('U'), s.count('P'), s.count('C')]
    print(min(c))

if __name__ == "__main__":
    run()