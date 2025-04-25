n = int(input())
arr = list(map(int, input().split()))
elemnt =list(map(int, input().split()))
pos  = list(map(int, input().split()))

for i in range(len(elemnt)):
    arr.insert(pos[i],elemnt[i])
    