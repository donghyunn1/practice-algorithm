sum_b = 0
lst = []
for _ in range(4):
    a, b = map(int, input().split())
    sum_b += b
    sum_b -= a
    lst.append(sum_b)

print(max(lst))

