from random import randint
def main():
        menu = {1:"roll dice",2:"rockPaperSciessor",3:"exit"}
        while True:
            try:
                usrInput = int(input("choose:-\n 1.roll dice\n 2.Play Rock Paper & Sciessor \n 3.exit\n")) 
                if usrInput == 1:
                    dice()
                elif usrInput ==2 :
                    rockPaperScissor()
                elif usrInput == 3:
                    break
            except:
                print("invalid input")
                break
def rockPaperScissor():
        Choices = {1:"rock",2:"paper",3:"Scissor"}
        score = 0;attempts = 0
        while True:
            userChoice = int(input("enter your choice 1:rock,2:paper,3:Scissor,4: exit\n"))
            try:
                if userChoice == 4:
                    if attempts >0:
                        print(f" Your Score is {score}/{attempts}")
                        print("thanks for playing.")
                        break
                    else:
                        break
                if userChoice not in {1,2,3}:
                    attempts -= (1)
                computerChoice = randint(1,3)
                attempts += 1
                print(f"you chose:{Choices[userChoice]} and computer chose:{Choices[computerChoice]}")
                if userChoice == computerChoice:
                    print("its a draw")
                    attempts-=1
                elif str(userChoice)+str(computerChoice) in ["13","21","32"]:
                    print("you win!")
                    score += 1
                else:
                    print("you lose")
            except:
                print("invalid choice") 
                print(f" Your Current Score is: {score}/{attempts}")
                break
def dice():
        menu = {1:"roll dice",3:"menu"}
        while True:
            try:
                usrInput = int(input("choose:-\n 1.roll dice\n 2.main menu\n")) 
                if usrInput == 1:
                    print(randint(1,6))
                elif usrInput == 2:
                    main()
                    break 
            except:
                print("invalid input")

