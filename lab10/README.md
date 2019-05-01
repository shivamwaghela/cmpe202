# Comparison of Gumball implementation from Lab 1 with AspectJ approach:

## Lab 1 Implementation:
   - The Lab1 implementation contains 1 abstract class named 'GumballMachine' and 3 child classes, one for each types of machines - 25 cent, 50 cent and any cent Gumball Machines.
   - Based on the user selection, respective class is instantiated. 
   - To add a new type of Gumball Machine, one has to create a new class for that type and implement respective actions. 

## Implementation using AspectJ:
   - AspectJ is used to make the code manageable. 
   - Using AspectJ, the programmer can simply change the structure of a class at compile time based on the selected configurations in the config file. 
   - Unlike Lab 1, new type of configuration for Gumball Machine can be easily added by simply introducing new AspectJ file.

