t = int(input())

for _ in range(t):
    case = int(input())
    max = 0
    name_max = ""
    for _ in range(case):
        name, num = input().split()
        num = int(num)
        if (num > max):
            max = num
            name_max = name

    print(name_max)