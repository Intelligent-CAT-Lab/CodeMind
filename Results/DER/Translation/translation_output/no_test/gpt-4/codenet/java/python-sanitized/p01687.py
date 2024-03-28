def main():
    p01687().run()

class p01687:
    def run(self):
        mstr = "AADINNUY"
        nstr = "AIZUNYAN"
        t = "AAAAAAAA"
        tt = ""

        try:
            # Keep reading lines until an EOFError is encountered
            while True:
                dstr = input()
                if len(dstr) < 8:
                    print(dstr)
                    continue

                for i in range(len(dstr) - 7):
                    t = dstr[i:i+8]
                    tt = ''.join(t)
                    sorted_t = ''.join(sorted(t))
                    if mstr == sorted_t:
                        dstr = dstr.replace(tt, nstr, 1)
                        i += 7  # Skip the next 7 characters as they are already replaced

                print(dstr)
        except EOFError:
            pass  # End of input

if __name__ == '__main__':
    main()