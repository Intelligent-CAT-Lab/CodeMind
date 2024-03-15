import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

def main():
    scanner = Scanner(System.in)
    question = scanner.nextLine().strip()
    originalQ = question[:-1].strip()
    ch = originalQ[-1]
    vowels = ['A', 'E', 'I', 'O', 'U', 'Y']
    b = any(e.lower() == ch.lower() or e.lower() == ch.upper() for e in vowels)
    print(b and 'YES' or 'NO')

if __name__ == '__main__':
    main()