def main():
    monster_hp = int(input())
    serval_atk = int(input())

    mod = monster_hp % serval_atk
    ans = monster_hp // serval_atk

    if mod > 0:
        ans += 1

    print(ans)

if __name__ == "__main__":
    main()