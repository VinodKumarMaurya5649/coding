
# Initialize theater seating 
seats = [[False] * 10 for _ in range(5)]
total = 0

def bookSeat(row, col):
    global total
    if seats[row - 1][col - 1]:  # Seat already booked
        print("Seat already booked")
    else:  # Book the seat
        seats[row - 1][col - 1] = True
        if row <= 3:  # Premium seat
            total += 500
        else:  # Standard seat
            total += 300
        print("Seat booked")

def checkSeat(row, col):
    if seats[row - 1][col - 1]:  # Seat booked
        print("Booked")
    else:  # Seat available
        print("Available")

def cancelSeat(row, col):
    global total
    if seats[row - 1][col - 1]:  # If booked, cancel
        seats[row - 1][col - 1] = False
        if row <= 3:  # Premium seat
            total -= 500
        else:  # Standard seat
            total -= 300
        print("Booking cancelled")
    else:  # If not booked
        print("Seat not booked")

def calculateTotal():
    print(total)

# Input handling
n = int(input("enter no. of operation"))  # Number of operations
for _ in range(n):
    instruction = input().split()
    if instruction[0] == "BOOK":
        bookSeat(int(instruction[1]), int(instruction[2]))
    elif instruction[0] == "CHECK":
        checkSeat(int(instruction[1]), int(instruction[2]))
    elif instruction[0] == "CANCEL":
        cancelSeat(int(instruction[1]), int(instruction[2]))
    elif instruction[0] == "TOTAL":
        calculateTotal()