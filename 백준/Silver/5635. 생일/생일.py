n = int(input())
 
arr1 = []
arr2 = []
 
for _ in range(n):
    name, dd, mm, yyyy = input().split()
    dd = int(dd)
    mm = int(mm)
    yyyy = int(yyyy)
    arr1.append([yyyy,mm,dd,name])
    arr2.append([yyyy,mm,dd,name])
 
arr1.sort()
arr2.sort(reverse=True)
 
print(arr2[0][3])   # 내림차순 정렬 = 가장 나이가 많은 사람
print(arr1[0][3])   # 오름차순 정렬 = 가장 나이가 적은 사람
