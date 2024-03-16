import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

class p03473:
    MASK = [1, 2, 4]

    def main(self):
        reader = InputStreamReader(System.in, StandardCharsets.UTF_8)
        in = BufferedReader(reader)
        M = int(in.readLine())
        result = (24 - M) + 24
        print(result)

p03473().main()