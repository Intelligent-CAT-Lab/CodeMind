class main:
    import sys
    
    def main():
        # Equivalent to ni() in Java
        N = int(input())
        
        # Calculate initial m and length l
        l = len(str(N))
        m = 0
        for i in range(l):
            m = (10 * m + 7) % N
        
        # Prepare array to mark visited numbers
        i = l
        vis = [False] * N
        
        while True:
            if vis[m]:
                print(-1)  # Equivalent to out.println(-1);
                break
            
            vis[m] = True
            
            if m == 0:
                print(i)  # Equivalent to out.println(i);
                break
            
            m = (10 * m + 7) % N
            i += 1
            
        # No need to manually close files in Python
    
    # If this script is the main script being run, execute main()
    if __name__ == '__main__':
        main()