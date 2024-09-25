case = int(input())

for _ in range(case):
    max = 0
    mName = ""
    T = int(input())
    for _ in range(T):
        price, name = map(str, input().split())
        price = (int(price))
        if price > max:
            max = price
            mName = name
    
    print(mName)