class main:
    import sys
    
    def main():
        helix = sys.stdin.readline().strip()
        if helix == "A":
            print("T")
        elif helix == "T":
            print("A")
        elif helix == "C":
            print("G")
        elif helix == "G":
            print("C")
        else:
            print("Invalid input")
    
    if __name__ == "__main__":
        main()