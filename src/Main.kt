/** A little guessing game in kotlin
 *
 */

fun main() {
    println("----------------------")
    println("THE GUESSING GAME")
    println("---------------------")
    println("The game that involves no skill.")
    println()

    var playerName = getString("Enter your name: ")
    println("Nice to meet you $playerName")


    val numToGuess = (1..100).random()

    println("I'm thinking of a number from 1 to 100.")
    println("Can you guess it?")
    println()

    var guessCount = 0

    // main loop\

    while (true) {
        // Ask the user for a guess
        print("Enter your guess: ")
        var guess = getInt("Enter your guess: ")

        // check if user is correct or not
        if (guess == null) {
            println("Please enter a valid number!")
            continue
        }

        //when correct break out of loop
        if (guess == numToGuess) {
            println("YOU ARE CORRECT!!! :)")
            println("Thank you for playing $playerName!")
            println("You took ${guessCount} guesses to guess it!")
            break
        }
        // otherwise give higher/lower feedback
        if (guess != null) {
            if (guess > 100) {
                println("Choose a lower number please")
            }

            if (guess < numToGuess) {
                println("Higher")
                guessCount++
            } else if (guess > numToGuess) {
                println("Lower")
                guessCount++
            }
        }

        // End game if they take 10 attempts
        if (guessCount == 10) {
                println("You are out of guesses")
                println("The correct number was ${numToGuess}")
                println("Thank you for playing$playerName!")
                break
            }
        }

    }

/**
 * Function to get a string from the user
 * parameters:
 * - prompt - text to show the user
 * returns:
 * - String that the user types
 */
fun getString(prompt: String): String {
    var userInput: String

    while(true) {
        print(prompt)

        userInput = readln()
        if (userInput.isNotBlank()) break
    }

    return userInput
}

/**
 * Function to get an Int from the user
 */

fun getInt(prompt: String): Int {
    var intValue: Int?

    while(true) {
        val userInput = getString(prompt)
        intValue = userInput.toIntOrNull()
        if (intValue != null) break
    }

    return intValue!!
}