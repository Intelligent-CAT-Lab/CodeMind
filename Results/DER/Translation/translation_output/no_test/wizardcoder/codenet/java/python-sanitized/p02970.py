import java.math.BigDecimal
import java.math.RoundingMode
import java.util.Scanner

def main():
    sc = Scanner(System.in)
    N = int(sc.next())
    D = int(sc.next())

    ans = BigDecimal(N / (D * 2 +