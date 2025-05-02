"""Write a program that will compute the GCD of two two numbers"""

# Using modules

import math

def compute_gcd(a,b):
    return math.gcd(a,b)

a=int(input("Enter the value of a: "))
b=int(input("Enter the value of b: "))

res=compute_gcd(a,b)

print("The GCD of a and b is: ",res)