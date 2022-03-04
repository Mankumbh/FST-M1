x = 1    # int
y = 2.8  # float
z = 1j   # complex

print(type(x)) 
print(type(y)) 
print(type(z)) 

print("Hello")
print('Hello') 

b = "Hello, World!"
print(b[2:5]) 
print(len(b))
print(b.lower())
print(b.upper())

a = "Hello, World!"
print(a.split(",")) 
print(a.replace("H", "J"))

txt = "The rain in Spain stays mainly in the plain"
x = "ain" in b
y = "ain" not in b
print(x) # True
print(y) # False
print(txt + b)

# age = 36
# txt = "My name is John, I am " + age
# print(txt)

age = 36
txt = "My name is John, and I am {}"
print(txt.format(age))

quantity = 3
itemno = 567
price = 49.95
myorder = "I want to pay {2} dollars for {0} pieces of item {1}."
print(myorder.format(quantity, itemno, price))

a = int(1)   	 # a will be 1
b = int(2.8)	 # b will be 2
c = int("3") 	 # c will be 3

x = float(1)     # x will be 1.0
y = float(2.8)   # y will be 2.8
z = float("3")   # z will be 3.0
w = float("4.2") # w will be 4.2

j = str("s1") 	 # j will be 's1'
k = str(2)    	 # k will be '2'
l = str(3.0)  	 # l will be '3.0' 

# username = input("Enter username:")
# print("Username is: " + username)

a = 5
b = 7
c = 9

if a > b:
  if a > c:
    print("a is the greatest")
  else:
    print("c is the greatest")
elif b > a:
  if b > c:
    print("b is the greatest")
  else:
    print("c is the greatest")

    a = 5
b = 7
c = 9

if a > b and a > c:
  print("a is the greatest")
elif b > a and b > c:
  print("b is the greatest")
elif c > a and c > b:
  print("c is the greatest")

  a = 0

while a < 5:
  print(a)
  a += 1

for x in "banana":
  print(x)