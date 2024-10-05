case = int(input())

for _ in range(case):
    a, b = input().split()
    a = int(a)

    print(b[:a-1] + b[a:], sep="")