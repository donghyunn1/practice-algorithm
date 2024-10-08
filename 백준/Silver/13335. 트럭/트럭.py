n, w, l = map(int, input().split())

truck = list(map(int, input().split()))

b = [0] * w
time = 0

while b:
    time += 1
    b.pop(0)
    if truck:
        if sum(b) + truck[0] <= l:
            b.append(truck.pop(0))
        else:
            b.append(0)

print(time)