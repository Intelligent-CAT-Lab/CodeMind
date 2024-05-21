import java.util.Scanner;

class p04029:

  def main(self):
    sc = Scanner(System.in)
    n = sc.nextInt()
    sum = 0
    for i in range(1, n+1):
      sum += i
    print(sum)