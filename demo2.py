def greet(name):
print("Hello, " + name)  # IndentationError: Missing indentation

def add_numbers(a, b)
    return a + b  # SyntaxError: Missing colon after function definition

def divide(a, b):
    return a / b  # Potential ZeroDivisionError if b is 0

numbers = [1, 2, 3]
print(numbers[5])  # IndexError: List index out of range

print("The result is: " + 10)  # TypeError: Cannot concatenate str and int

if name == "Alice":  # NameError: 'name' is not defined
    print("Welcome, Alice!")
