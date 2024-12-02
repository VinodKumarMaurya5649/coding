name = input(" hello user ! please enter your name:\n")
CorrectName = name.strip().title()
msg = f"hello {CorrectName},welcome to personalized adventventure\n"
print(msg)
place = input("please choose (beach/mountain):\t").strip().title() 
if place == "Mountain":
    print("You Selected Mountain")
elif place == "Beach":
    print("You Selected beach")
    print("PLease input a valid place")
budget = int(input("enter budget\t"))
if budget>= 500: 
    print("luxury\n")
elif 200 <= budget <= 499: 
    print('Good\n')
elif budget <200: 
    print('Budget Freindly\n')
days = int(input('enter days'))
totalCost = budget * days
print(totalCost)
      
