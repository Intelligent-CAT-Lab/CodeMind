def main():
    translator = Translator()
    translator.run()


class Translator:
    def __init__(self):
        self.in_matrix = [
            ["wa", "nn", "wo", "", ""],
            ["a", "u", "o", "i", "e"],
            ["ka", "ku", "ko", "ki", "ke"],
            ["sa", "su", "so", "si", "se"],
            ["ta", "tu", "to", "ti", "te"],
            ["na", "nu", "no", "ni", "ne"],
            ["ha", "hu", "ho", "hi", "he"],
            ["ma", "mu", "mo", "mi", "me"],
            ["ya", "yu", "yo", "", ""],
            ["ra", "ru", "ro", "ri", "re"],
        ]

    def run(self):
        try:
            while True:
                fl = input()
                result = ''
                for i in range(0, len(fl), 2):
                    c = self.get_column_index(fl[i + 1])
                    result += self.in_matrix[int(fl[i])][c]
                print(result)
        except EOFError:
            pass

    @staticmethod
    def get_column_index(direction):
        direction_to_index = {'T': 0, 'L': 3, 'U': 1, 'R': 4, 'D': 2}
        return direction_to_index.get(direction, -1)


if __name__ == '__main__':
    main()