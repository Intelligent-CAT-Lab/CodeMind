import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class p03698:
    def main(self, args):
        try:
            with BufferedReader(InputStreamReader(System.in)) as br:
                inputString = br.readLine().split("")
                removeDuplication = set(inputString)

                ans = "no"
                if len(inputString) == len(removeDuplication):
                    ans = "yes"

                print(ans)
        except IOException as e:
            e.printStackTrace()
            System.exit(0)
        except Exception as e:
            e.printStackTrace()
            System.exit(0)

p03698().main(None)