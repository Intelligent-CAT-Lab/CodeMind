class p01531:
    def __init__(self):
        self.in_table = [
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
                encoded_input = input()
                decoded_output = self.decode_input(encoded_input)
                print(decoded_output)
            except EOFError:
                break
    
    def decode_input(self, encoded_input):
        decoded_output = ""
        for i in range(0, len(encoded_input), 2):
            c = 0
            direction = encoded_input[i+1]
            if direction == 'T':
                c = 0
            elif direction == 'L':
                c = 3
            elif direction == 'U':
                c = 1
            elif direction == 'R':
                c = 4
            elif direction == 'D':
                c = 2
            decoded_output += self.in_table[int(encoded_input[i])][c]
        return decoded_output

if __name__ == "__main__":
    p = p01531()
    p.run()