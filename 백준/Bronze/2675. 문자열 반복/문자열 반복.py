case = int(input())

for _ in range(case):
    cnt, word = input().split()
    for x in word:
        print(x*int(cnt), end="")
    print()  