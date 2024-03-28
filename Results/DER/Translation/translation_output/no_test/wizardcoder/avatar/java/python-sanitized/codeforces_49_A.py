import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class codeforces_49_A:
    def main(self):
        scanner = Scanner(System.in)
        question = scanner.nextLine().strip()
        originalQ = question[:-1].strip()
        ch = originalQ[-1]
        vowels = ["A", "E", "I", "O", "U", "Y"]
        b = any(e.lower() == ch.lower() or e == ch for e in vowels)
        print("YES" if b else "NO")

if __name__ == '__main__':
    codeforces_49_A().main()