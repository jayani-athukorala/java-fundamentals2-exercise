# Java Date/Time and String Exercises

This project contains a set of **Java exercises** for practicing **Date/Time API** and **String manipulation**. 
It is structured into two main classes:

- `DateTimeExercise.java` – exercises using `LocalDate`, `LocalTime`, `LocalDateTime`, `Period`, and `DateTimeFormatter`.
- `StringExercise.java` – exercises using `String` operations such as length, charAt, substring, split, and conversion.

---
## 📂 Project Structure
```
src/main/java/se.lexicon/
├─ DateTimeExercise.java # Functions related to Date/Time exercises
├─ StringExercise.java   # Functiona related to String exercises
└─ Main.java             # Runs all exercises sequentially.
```

## 🛠 How to Run

1. Clone the repository:

```bash
git clone https://github.com/jayani-athukorala/java-fundamentals2-exercise.git
```

2. Open the project in preferred IDE. 

3. Build and run `Main.java`
```bash
javac -d out src/main/java/se/lexicon/*.java
java -cp out se.lexicon.Main
```

The output of all exercises will be printed in the console.

## 📌 Exercise Overview

### Date/Time Exercises

- Print current date
- Print formatted current date
- Print last Monday and the week
- Parse date from string
- Print day of the week for birthday
- Future and past date adjustments
- Period between dates
- Add period to current date
- Print current time
- Print nanoseconds of current time
- Parse time from string
- Print formatted current time
- Create specific LocalDateTime
- Print formatted LocalDateTime
- Combine LocalDate and LocalTime
- Extract date and time from LocalDateTime

### String Exercises

- Print length of a string
- Print character at specific index
- Print index of a character
- Print substring
- Print lowercase and uppercase
- Print trimmed string
- Parse int to string and append
- Split "Oil and Water"
- Split names and print
- Convert string to char array
- Convert char array to string

---