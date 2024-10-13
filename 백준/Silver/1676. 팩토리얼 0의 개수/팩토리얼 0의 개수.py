n = int(input())

cnt = 0

while n >0:
    cnt = cnt + n//5
    n = n // 5

print(cnt)