/** A little guessing game in kotlin
 *
 */

fun main() {
    println("----------------------")
    println("THE GUESSING GAME")
    println("---------------------")
    println("The game that involves no skill.")
    println()

    val numToGuess = (1..100).random()

    println("I'm thinking of a number from 1 to 100.")
    println("Can you guess it?")
    var guessCount = 0

    // main loop\

    while (true) {
        // Ask the user for their first guess
        print("Enter your first number:")
        val input = readLine()?.toIntOrNull()

        // check if user is correct or not
        if (input == null) {
            println("Please enter a valid number!")
        }
        //when correct break out of loop
        if (input == numToGuess) {
            println("YOU ARE CORRECT!!! :)")
            println("Thank you for playing!")
            println("You took ${guessCount} guesses to guess it!")
            break
        }
        // otherwise give higher/lower feedback
        if (input != null) {
            if (input > 100) {
                println("Choose a lower number please")
            }

            if (input < numToGuess) {
                println("Higher")
                guessCount++
            } else if (input > numToGuess) {
                println("Lower")
                guessCount++
            }
        }

        // End game if they take 10 attempts
        if (guessCount == 10) {
                println("You are out of guesses")
                println("The correct number was ${numToGuess}")
                println("Thank you for playing!")
                break
            }
        }

    }

