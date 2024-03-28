def main():
    # Creating the equivalent of Java's in[][] array as a list of lists in Python
    in_chars = [
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

    # Simulating reading from input using a while loop in Java
    # In Python, this can be done with a try-except block to handle EOF
    try:
        while True:
            fl = input()
            result = []
            for i in range(0, len(fl), 2):  # Incrementing by 2 to get character pairs
                # Map characters 'T', 'L', 'U', 'R', 'D' to column indices 0 to 4 respectively
                c = {'T': 0, 'L': 3, 'U': 1, 'R': 4, 'D': 2}.get(fl[i + 1], -1)
                if c >= 0:  # If a valid direction character is found
                    # Add corresponding character from in_chars to result
                    result.append(in_chars[int(fl[i])][c])
            # Print the result joined as a string
            print(''.join(result))
    except EOFError:  # To handle the end of input
        pass

# Execute the main function
if __name__ == '__main__':
    main()