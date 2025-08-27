

# Mind Guess 🎯

An interactive Java console game where the computer guesses the number you’re thinking of — any integer, positive or negative — using binary search.

## Versions

* **One-Sided Expansion** → Starts at `0`, doubles outward (`0 → 1 → 2 → 4 → …`) until your number is bracketed, then binary search finds it.
* **Symmetric Expansion** → Expands both directions (`[-1,1] → [-2,2] → [-4,4] …`) until your number is bracketed, then binary search finds it. Faster for negative numbers.

## How to Run

Compile and run either version:

```bash
javac MindGuess.java
java MindGuess
```

## Example: One-Sided Expansion

```
Welcome to Mind Guess!
Think of ANY integer (positive or negative).
Is your number 0? (higher/lower/correct)
higher
Is your number 1? (higher/lower/correct)
higher
Is your number 2? (higher/lower/correct)
higher
Is your number 4? (higher/lower/correct)
lower
Is your number 3? (higher/lower/correct)
correct
Yay! I guessed your number: 3
```

## Example: Symmetric Expansion

```
Welcome to Mind Guess!
Think of ANY integer (positive or negative).
Is your number between -1 and 1? (yes/no/correct-if-boundary)
no
Is your number between -2 and 2? (yes/no/correct-if-boundary)
no
Is your number between -4 and 4? (yes/no/correct-if-boundary)
yes
Is your number 0? (higher/lower/correct)
higher
Is your number 2? (higher/lower/correct)
lower
Is your number 1? (higher/lower/correct)
correct
Yay! I guessed your number: 1
```
