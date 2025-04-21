# Function to find the maximum element in a list

# Step 1: Initialize the maximum element as the first element of the list
# Step 2: Iterate through the list to compare each element
# Step 3: Update max_element if the current number is great
# Step 4: Return the maximum element
n:int = int(input())
arr: list = [int(x) for x in input().split()]
max: int = arr[0]
for i in range(1,n):
    if arr[i]> max:
        max = arr[i]
print(max)
# time complexity O(n)
#space complexity O(1)
#total oprations  o(1) + O(n) + 
#find max element and position
