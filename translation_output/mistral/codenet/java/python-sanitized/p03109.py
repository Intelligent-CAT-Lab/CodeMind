import java.util.Scanner

class p03109:
    def main(self, args):
        scn = Scanner(input)
        time = scn.next().substring(5)
        if time[0] == '1' or int(time[1]) > 4:
            print("TBD")
        else:
            print("Heisei")