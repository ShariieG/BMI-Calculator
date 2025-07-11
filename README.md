# 🧮 BMI Calculator – BlueJ Project

A simple Java console application developed using BlueJ. It calculates **Body Mass Index (BMI)** and **Total Body Water (TBW)**, provides health summaries, and makes basic recommendations. This project was created as part of preparation for the **Java SE 8 OCA certification**.

---

## 📁 Project Structure

- `BMICal.java` – Main class that handles all logic for BMI, TBW, and user interaction  
- `package.bluej` – BlueJ configuration file for managing the project environment

---

## ✅ Features

- Collects user details: name, surname, age, gender
- BMI calculation (metric and imperial)
- Determines BMI category (underweight, normal, overweight, etc.)
- Calculates Total Body Water (TBW)
- Displays a health summary
- Clean separation into methods like `bmiProgram()` and `tbwProgram()`
- Input validation for unit types and personal data

---
## 🖼️ Output Preview

Below is an example of what the console output looks like when running the BMI Calculator:

 <img width="1920" height="1080" alt="Screenshot 2025-07-11 141911" src="https://github.com/user-attachments/assets/ed0e579b-be5f-4ae0-a742-0e66e04e413f" />


## 🔧 How to Run

### 📘 Using BlueJ

1. Open **BlueJ**
2. Go to **Project > Open Project...**
3. Select the folder containing this project (`BMICal.java` and `package.bluej`)
4. Right-click on the `BMICal` class
5. Select `void main(String[] args)` to run

### 💻 Using Terminal (Optional)

```bash
javac BMICal.java
java BMICal
