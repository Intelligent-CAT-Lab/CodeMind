def main():
    monster_hp, serval_atk = map(int, input().split())

    mod = monster_hp % serval_atk
    ans = monster_hp // serval_atk

    if mod > 0:
        ans += 1

    print(ans)

if __name__ == "__main__":
    main()