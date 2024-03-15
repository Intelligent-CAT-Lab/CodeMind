class p00017:
    def compute(self):
        while True:
            try:
                S = input()
            except EOFError:
                break

            for i in range(26):
                converted = ""
                for c in S:
                    if 'a' <= c <= 'z':
                        offset = ord(c) + i
                        if offset > ord('z'):
                            offset -= 26
                        converted += chr(offset)
                    else:
                        converted += c

                if "the" in converted or "this" in converted or "that" in converted:
                    print(converted)
                    break

if __name__ == "__main__":
    solver = p00017()
    solver.compute()