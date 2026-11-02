# Task14-Bulid-a-Shape-Calculator-Using-Abstraction
java calculation

## 1. Project Description

The Shape Calculator is a Java application developed using the concept of **Abstraction and Inheritance**.

In this program, an abstract class named `Shape` is created. It contains two abstract methods: `calculateArea()` and `calculatePerimeter()`.

Three child classes, `Circle`, `Rectangle`, and `Triangle`, inherit the Shape class and provide their own implementations of these methods.

The program accepts input from the user and calculates the area and perimeter of each shape.

## 2. Objective

- To understand abstraction in Java.
- To create and use an abstract class.
- To implement inheritance.
- To understand method overriding.
- To calculate the area and perimeter of different shapes.

## 3. Program Structure

The program contains four main classes:

### 1. Shape (Abstract Class)

- Acts as the parent class.
- Contains two abstract methods:
  - `calculateArea()`
  - `calculatePerimeter()`
- These methods are implemented by the child classes.

### 2. Circle Class

- Inherits the Shape class.
- Accepts the radius as input.
- Calculates the area and perimeter of a circle.

### 3. Rectangle Class

- Inherits the Shape class.
- Accepts length and width as input.
- Calculates the area and perimeter of a rectangle.

### 4. Triangle Class

- Inherits the Shape class.
- Accepts three sides as input.
- Calculates the perimeter by adding all three sides.
- Calculates the area using Heron's formula.

## 5. Formulas Used

**Circle**

- Area = π × radius × radius
- Perimeter = 2 × π × radius

**Rectangle**

- Area = Length × Width
- Perimeter = 2 × (Length + Width)

**Triangle**

- Semi-perimeter = (a + b + c) / 2
- Area = √[s × (s-a) × (s-b) × (s-c)]
- Perimeter = a + b + c

Where:
- a, b, c represent the three sides.
- s represents the semi-perimeter.

## 6. Working Procedure

1. Import the Scanner class to accept user input.
2. Create an abstract class named `Shape`.
3. Declare two abstract methods for calculating area and perimeter.
4. Create the Circle class and extend the Shape class.
5. Implement the area and perimeter methods for Circle.
6. Create the Rectangle class and implement its calculations.
7. Create the Triangle class and implement its calculations using Heron's formula.
8. Create the Main class.
9. Accept the required dimensions from the user.
10. Create objects for Circle, Rectangle, and Triangle.
11. Display the calculated area and perimeter.
12. Check whether
