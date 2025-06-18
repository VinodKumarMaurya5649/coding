import tkinter as tk
from tkinter import messagebox

# Function to display greeting
def greet_user():
    name = entry.get()
    if name.strip():
        messagebox.showinfo("Greeting", f"Hello, {name}! Welcome!")
    else:
        messagebox.showwarning("Input Error", "Please enter your name.")

# Create the main window
root = tk.Tk()
root.title("Simple Tkinter App")
root.geometry("300x200")

# Add a label
label = tk.Label(root, text="Enter your name:", font=("Arial", 12))
label.pack(pady=10)

# Add an entry field
entry = tk.Entry(root, font=("Arial", 12))
entry.pack(pady=5)

# Add a button
button = tk.Button(root, text="Greet Me", font=("Arial", 12), command=greet_user)
button.pack(pady=10)

# Run the application
root.mainloop()
