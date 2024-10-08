N, M = map(int, input().split())

cost_table = []
for _ in range(N):
     cost = int(input())
     cost_table.append(cost)

cars_weight = [0]
for _ in range(M):
    weight = int(input())
    cars_weight.append(weight)

answer = 0

# 주차 공간 생성. 0은 비어있다는 의미
space = [0 for _ in range(N)]

# 주차 공간이 부족하면 대기할 대기열
queue = []

# count: 현재 주차된 총 댓수.
# for를 통해 매번 비어있는지 확인해도 되지만
# 매번 전체 주차 공간을 탐색하면 비효율적임.
# count와 N이 동일하면 빈 공간이 없다고 판단할 수 있음.
count = 0

for i in range(2 * M):
    # car: 양수이면, 해당 번호의 차량 주차. 음수이면 해당 번호의 차량 출차
    car = int(input())
    # 주차하는 경우
    if car > 0:
        # space가 만차 상태이면
        if count == N:
            queue.append(car)
        else:
            for j in range(N):
                if space[j] == 0:
                    space[j] = car
                    count += 1
                    break
    # 출차하는 경우
    else:
        car = car * -1
        # 아래는 주차된 공간에서 car 차량을 찾는 로직
        for j in range(N):
            # 현재 확인중인 공간에 car가 주차되어 있으면
            if space[j] == car:
                car_cost = cost_table[j] * cars_weight[space[j]]
                answer += car_cost
                # 대기차량이 있으면
                if queue:
                    space[j] = queue.pop(0)
                # 대기 차량이 없으면
                else:
                    space[j] = 0
                    count -= 1

print(answer)