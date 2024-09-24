case = int(input())
score_A = score_B = 100

for _ in range(case):
    A, B = map(int, input().split())

    if A > B:
        score_B = score_B - A
    elif A < B:
        score_A = score_A - B

print(score_A)
print(score_B)