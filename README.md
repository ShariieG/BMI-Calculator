# 🧮 BMI Calculator

A Java console application that calculates **Body Mass Index (BMI)**, **Total Body Water (TBW)** and **Basal Metabolic Rate (BMR)**, then prints a personal health summary. I built it while preparing for the **Oracle Java SE 8 (OCA)** certification.

`Java` `Console I/O` `BlueJ`

---

## ✅ Features

- **BMI** in metric (kg and m) or imperial (lb and in), with a BMI category
- **Realistic-range checks** on height and weight, re-prompting when a value looks wrong
- **Total Body Water** using separate formulas for men and women
- **Basal Metabolic Rate** (Mifflin-St Jeor equation): the calories your body needs at rest
- **Summary** of name, gender, age, unit system, BMI, category and TBW
- Each calculator can be re-run without restarting the program

---

## 🖼️ Output preview

<img width="1920" height="1080" alt="BMI Calculator console output" src="https://github.com/user-attachments/assets/ed0e579b-be5f-4ae0-a742-0e66e04e413f" />

---

## 📁 Project structure

| File | Purpose |
|---|---|
| `BMICal.java` | All program logic: `bmiProgram()`, `tbwProgram()`, `BasalMR()`, `summary()` and input validation |
| `package.bluej`, `README.TXT` | BlueJ project files |

---

## 🔧 How to run

**Terminal**

```bash
javac BMICal.java
java BMICal
```

**BlueJ:** open the project folder, right-click `BMICal`, then choose `void main(String[] args)`.

---

## 🧠 What I practised

- Breaking a program into focused static methods
- Input validation loops with `do-while`
- Formatting numeric output with `String.format`
- Applying real-world formulas in code

---

## 👩🏾‍💻 Author

**Sharon Galela** · [LinkedIn](https://www.linkedin.com/in/sharon-galela-6998bb265) · [GitHub](https://github.com/ShariieG)
