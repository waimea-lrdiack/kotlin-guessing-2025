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

    // main loop\

    while (true) {
        // Ask the user for a guess
        print("Enter your first number:")
        val input = readLine()

        // check if user is correct or not

        // break out of loop

        // otherwise give higher/lower feedback
    }
}