class p01531:
    in_matrix = [
        ["wa", "nn", "wo", "", ""],
        ["a", "u", "o", "i", "e"],
        ["ka", "ku", "ko", "ki", "ke"],
        ["sa", "su", "so", "si", "se"],
        ["ta", "tu", "to", "ti", "te"],
        ["na", "nu", "no", "ni", "ne"],
        ["ha", "hu", "ho", "hi", "he"],
        ["ma", "mu", "mo", "mi", "me"],
        ["ya", "yu", "yo", "", ""],
        ["ra", "ru", "ro", "ri", "re"]
    ]

    def run(self):
        while True:
            try:
                fl = input()
                for i in range(0, len(fl), 2):
                    c = 0
                    switcher = {
                        'T': 0,
                        'L': 3,
                        'U': 1,
                        'R': 4,
                        'D': 2
                    }
                    c = switcher.get(fl[i+1], 0)
                    print(self.in_matrix[int(fl[i])][c], end="")
                print()
            except EOFError:
                break

p = p01531()
p.run()