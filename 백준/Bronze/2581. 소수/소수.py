M = int(input())
N = int(input())

lst = []

for num in range(M, N+1):
    count = 0
    if num > 1:
        for i in range(2, num):
            if num % i == 0:
                count += 1
                break
        if count == 0:
            lst.append(num)

            
if len(lst) > 0:
    print(sum(lst))
    print(min(lst))
else:
    print(-1)
