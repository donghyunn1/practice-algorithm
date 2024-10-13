max = 0
index = 0
for i in range(1,6):
    lst = []
    lst = list(map(int, input().split()))

    if sum(lst) > max:
        max = sum(lst)
        index = i

print(index, max, sep=" ")