 01.03-JavaColletions-Nivel1

# Exercise 1

## Description
Create a class named `Month` with an attribute `"name"` (which will store the name of the month of the year).  
Add 11 `Month` objects (each with a different attribute) to an `ArrayList`, except for the object with the attribute  
`"Agost"`.  
Then, insert it in the correct position corresponding to this month and demonstrate that the `ArrayList` maintains the  
correct order.  
Convert the `ArrayList` from the previous exercise into a `HashSet` and ensure that it does not allow duplicates.  
Traverse the list using both a `for` loop and an iterator.

---

# Exercise 2

## Description
1. Create and fill a `List<Integer>`.
2. Create a second `List<Integer>` and insert the elements from the first list into the second one in reverse order.
3. Use `ListIterator` objects to read the elements from the first list and insert them into the second.

# Exercise 3

## Description
Given the file `countries.txt` (see the resources section) that contains countries and capitals, the program must read 
the file and store the data in a `HashMap<String, String>`.
The program prompts the user for their name and then randomly displays a country from the `HashMap`. The user must 
enter the capital of the displayed country. If the answer is correct, the user earns a point.
This process repeats **10 times**. After 10 rounds, the user's name and final score are saved in a 
file named `classification.txt`.

## Functionality
1. **Read `countries.txt`** and store countries and capitals in a `HashMap`.
2. **Ask the user for their name**.
3. **Randomly select a country** and ask the user for its capital.
4. **Award points** for correct answers.
5. **Repeat for 10 rounds**.
6. **Save the user's name and score** in `classification.txt`.

## Requirements
- Java 8 or higher
- `countries.txt` file located in the `src/Files/txt/` directory

## Usage
1. Compile and run the program.
2. Enter your name when prompted.
3. Answer the capital questions.
4. View your final score.
5. Check `classification.txt` for saved results.

## Example
```
Enter your name: Alice
What is the capital of France? Paris
✅ Correct!
...
Alice, your final score is: 8/10
Score saved in classification.txt
```

---



