fun main() {
    println("@dobrodelete")
    val validInput = setOf("rock", "paper", "scissors")

    println("Welcome to Rock-Paper-Scissors game!\n")

    while (true) {
        print("Enter your choice (rock, paper or scissors): ")
        val playerChoice = readLine()?.lowercase()

        if (playerChoice !in validInput) {
            println("Invalid choice. Please enter rock, paper or scissors.")
            continue
        }

        val computerChoice = validInput.random()

        println("\nYou chose $playerChoice")
        println("Computer chose $computerChoice\n")

        when {
            playerChoice == computerChoice -> {
                println("It's a draw!")
            }
            playerChoice == "rock" && computerChoice == "scissors"
                    || playerChoice == "paper" && computerChoice == "rock"
                    || playerChoice == "scissors" && computerChoice == "paper" -> {
                println("Congratulations! You win!")
            }
            else -> {
                println("Sorry, you lose!")
            }
        }

        print("\nWould you like to play again? (y/n): ")
        val playAgain = readLine()?.lowercase()

        if (playAgain != "y") {
            break
        }

        println()
    }

    println("Thanks for playing!")
}