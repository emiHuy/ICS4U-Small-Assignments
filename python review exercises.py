# some defs would be in main code if they had a separate file.
# other defs would remain as defs if each exercise has own file.
# normally, there would not be a def called in another def.

import random

def exercise_one():
  int1 = int(input('Enter an integer: '))
  int2 = int(input('Enter another integer: '))
  print('The quotient of', int1, 'and', int2, 'is', int1//int2, 'with a remainder of', int1%int2, end='.')

def exercise_two():
  numList = ['w', 'x', 'y', 'z']
  valList = []
  for i in range(4):
    value = int(input(f'Enter in your {numList[i]} value: '))
    valList.append(value)
  print(f'Your largest variable is {numList[valList.index(max(valList))]}, which has a value of {max(valList)}.')

def exercise_three(): 
  while True:
    try: 
      initial_price = float(input("What is the price of your purchase? "))
      if initial_price < 0:
        print("Please enter an appropriate value. \n")
        continue
    except ValueError: 
      print("Please enter an appropriate value. \n")		
    else:
        break
  if initial_price < 25:
    savings = 0.00
  elif 25 <= initial_price < 50:
      savings = 0.10
  elif 50 <= initial_price < 75:
      savings = 0.20
  elif 75 <= initial_price < 100:
      savings = 0.30
  else:
      savings = 0.40
  print(f'Your final cost is ${initial_price - initial_price*savings:0.2f}.')

def exercise_five():
  count = 1 
  while count < 20:
    count += 1
    print(count, end=" ")
  print("\n")

  count = 1
  for count in range(1,20):
    count+=1
    print(count, end=" ")
  print("\n")

  count = 1
  while count < 21:
    print(count, end=" ")
    count += 1
  print("\n")

  count = 0
  while count < 20:
    count += 1
    print(count, end=" ")
  print("\n")

def exercise_six():
  word_count = 0
  while True:
    word = str(input("Enter a word: "))
    if word == "quit" or word == "exit":
      print(f"You enter {word_count} words before stopping the loop.")
      break
    else:
      word_count += 1

def exercise_seven():
  list_numbers = []
  for i in range (7):
    list_numbers.append(i+1)
    for x in range (len(list_numbers)):
      print(list_numbers[x], end=" ")
    print("\n")

def exercise_eight_error_check (type, prompt):
  while True: 
    try:
      variable = type(input(prompt))
      if variable < 0:
        print("Invalid. \n")
        continue
    except ValueError:
      print("Invalid. \n")
      continue
    return variable

def exercise_eight():
  mark_num = exercise_eight_error_check(int, "How many marks will you be entering? ")
  sum = 0
  for i in range (mark_num):
    mark = exercise_eight_error_check (int, "Enter a mark: ")
    sum += mark
  print(f"The average of all marks entered is {sum/mark_num:0.1f}.")

def exercise_nine():
  start_val = int(input("Enter the starting value: "))
  ending_val = int(input("Enter the ending value: "))
  increment = int(input("What is the increment? "))
  print(f"{'Value':>10s}{'Square':>10s}")
  for Value in range(start_val, ending_val, increment):
    Square = Value**2
    print(f"{Value:8d}{Square:10d}")

def exercise_ten():
  getX = int(input("Enter an integer: "))
  getY = int(input("Enter another integer: "))
  if getY > getX:
    print(random.randrange(getX, getY))
  else:
    print(random.randrange(getY, getX))

def celciusToFahrenheit(celcius):
  convertFahrenheit = celcius*9/5+32
  return convertFahrenheit

def exercise_eleven():
  celcius = float(input("Enter the temperature in degrees Celcius. "))
  fahrenheit = celciusToFahrenheit(celcius)
  print(f"{celcius:0.1f} degrees Celcius = {fahrenheit:0.1f} degrees Fahrenheit")

def histogram(int_list):
  for i in range(len(int_list)):
    print("*"*int_list[i])

def exercise_twelve():
  numInt = int(input("How many integers will you be entering? "))
  int_list = []
  for i in range(numInt):
    intValue = int(input("Enter an integer: "))
    int_list.append(intValue)
  histogram(int_list)

def exercise_thirteen():
  while True:
    try:
      val = int(input("Enter an integer: "))
    except ValueError:
      print("Try again.")
    else:
      print(f"{val} is a valid integer.")
      break

def exercise_fourteen():
  countVal = int(input("How many integers will you be entering? "))
  num_list = []
  sum = 0
  for i in range(countVal):
    val = int(input("Enter an integer: "))
    num_list.append(val)
    sum += val
  print(f"This is your list: \n{num_list}\nThe sum of this list is {sum}.")

def exercise_fifteen():
  while True:
    pointVal = random.randrange(1,6)
    print(f"Your first roll and point value is: {pointVal}")
    numRolls = 0
    while True:
      next_roll = random.randrange(1,6)
      numRolls+=1
      print(f"Your next roll is: {next_roll}")
      if next_roll == pointVal:
        print(f"It took {numRolls} rolls to get your point again.")
        break
    playAgain = input("Do you want to play again? (Y/N) ")
    if playAgain == 'N':
      break

exercise_fifteen()