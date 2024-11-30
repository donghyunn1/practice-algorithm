from collections import deque

def find_path_to_one(N):
    # 방문 기록과 이전 숫자를 저장하는 딕셔너리
    visited = {N: None}
    queue = deque([(N, [N])])
    
    while queue:
        num, path = queue.popleft()
        
        if num == 1:
            return len(path) - 1, path
            
        # 3으로 나누기
        if num % 3 == 0 and num // 3 not in visited:
            next_num = num // 3
            visited[next_num] = num
            queue.append((next_num, path + [next_num]))
            
        # 2로 나누기
        if num % 2 == 0 and num // 2 not in visited:
            next_num = num // 2
            visited[next_num] = num
            queue.append((next_num, path + [next_num]))
            
        # 1 빼기
        if num - 1 not in visited:
            next_num = num - 1
            visited[next_num] = num
            queue.append((next_num, path + [next_num]))
    
    return 0, []

# 입력 받기
N = int(input())

# 결과 계산
count, path = find_path_to_one(N)

# 출력
print(count)
print(' '.join(map(str, path)))