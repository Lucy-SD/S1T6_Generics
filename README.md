# 🎓 Java Generics Exercises

**👨‍💻 Author**: Lucy Castro  
**🧠 Learning Focus**: Java Generics and Interfaces  
**🛠️ IDE**: IntelliJ IDEA  
**💡 Java SDK**:  21  

## 📄 Description
This repository contains Java exercises focused on:

- Generic classes and methods

- Type parameters and bounds

- Generic method restrictions

- Interface implementation with generics


## 💻 Technologies Used
- ☕ Java 21

- 🧠 IntelliJ IDEA

- 🗃️ Git & GitHub
  
- ⌨️ Command Line Tools

## 📋 Requirements
- ✅ Java JDK 21
- ✅ IntelliJ IDEA
- ✅ Git
- ✅ Internet connection


## 🛠️ Installation

git clone https://github.com/Lucy-SD/S1T6_Generics

Open in IntelliJ: File > Open > S1T6_Generics

Set SDK: File > Project Structure > Project SDK > JDK 21


## 📚 Exercise Catalog

### 📂 Level 1: Generics Fundamentals

<summary><strong>Exercise 1: NoGenericMethods</strong></summary>
<details>
Create a class called NoGenericMethods that stores three arguments of the same type, along with methods for storing and retrieving these objects and a constructor to initialize all three. Verify that the arguments can be placed in any position in the constructor call.
</details>

<summary><strong>Exercise 2: GenericMethods</strong></summary>
<details>
Create a class called Person with the attributes first name, last name, and age. Then create a class called GenericMethods with a generic method that accepts three arguments of generic type. This method should only print the arguments it receives to the screen. In the main() of the main class, call the generic method with different types of parameters.
Example : an object of the Person class, a String and a primitive type.
In this way you have verified that any type of parameter can be passed to it and in any order.
</details>

### 📂 Level 2: Advanced Generics

<summary><strong>EExercise 1: MixedGenericMethod</strong></summary>

<details>
Modify the previous exercise so that one of the arguments to the generic method is not generic.
</details>

<summary><strong>Exercise 2: VarargsGenericMethod</strong></summary>
<details>
Modify the previous section so that the arguments to the generic method are an undefined variable argument list.
</details>

### 📂 Level 3: Bounded Generics

<summary><strong>Exercise 1: Phone Interface</strong></summary>
<details>
To do this exercise you need an interface called Telephone and three classes: Smartphone, Generic and Main.
The Phone interface must have a method called call(). The Smartphone class must implement Phone, and in addition to the call() method, it must also have the takePhotos() method. 
The Generic class must have two generic methods, the first must receive an argument type limited by the Telephone interface and the second must receive an argument limited by the Smartphone class. From these two methods call the relevant methods of Telephone and Smartphone. In the main() of the Main class, an object of the Smartphone class is passed to the two generic methods of the Generic class.
Can the method bounded by the Phone interface, of the Generic class, call the makePhotos() method?

  
Key Technical Answers

The method bounded by Phone interface cannot call takePhotos()

Only the method bounded by Smartphone class can call takePhotos()

This demonstrates interface bounds vs. concrete class bounds
</details>


## 🎯 Learning Goals

✅ Generic class implementation

✅ Generic method syntax

✅ Bounded type parameters

✅ Interface vs class bounds

✅ Varargs with generics

## 🏆 Best Practices Implemented

✔ Followed generic type naming conventions (T, U, V)

✔ Used proper bounds syntax (<T extends Phone>)

✔ Implemented type safety checks

✔ Programmed in English

✔ Used proper directory structure

## 🤝 Contributions

⭐ Star the repository

🍴 Fork the project

📥 Create a pull request

## 🌐 Deployment

For educational purposes only.

### 🚀 Thanks for Visiting!
