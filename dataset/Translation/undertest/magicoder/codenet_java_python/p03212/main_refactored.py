class main:
    def main():
        N = int(input())
        queue = ["357", "375", "537", "573", "735", "753"]
        count = 0
        ch = ['3', '5', '7']
        if N < 1000:
            for s in queue:
                if int(s) <= N:
                    count += 1
            print(count)
            return
        while queue:
            s = queue.pop(0)
            if int(s) <= N:
                count += 1
                for i in range(len(s) + 1):
                    for c in ch:
                        temp = add_char(s, i, c)
                        if temp not in queue:
                            queue.append(temp)
        print(count)
    
    def add_char(s, location, c):
        return s[:location] + c + s[location:]
    
    if __name__ == "__main__":
        main()