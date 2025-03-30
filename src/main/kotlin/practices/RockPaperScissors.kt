package practices

import kotlin.random.Random


/*

3x3 result table

0 : 바위
1 : 가위
2 : 보

<player 기준>
L : 짐
W : 이김
T : 비김

     0   1   2 ( player choice)
 0   T   L   W
 1   W   T   L
 2   L   W   T


 */
fun convertChoice(choice: Int): String {

    when (choice) {
        0 -> return "ROCK"
        1 -> return "SCISSORS"
        2 -> return "PAPER"
    }
    return ""
}

fun printResult(user: Int, com: Int) {

    val resultTable = arrayOf(
        arrayOf('T', 'L', 'W'), arrayOf('W', 'T', 'L'), arrayOf('L', 'W', 'T')
    )

    println("당신 : " + convertChoice(user))
    println("컴퓨터 : " + convertChoice(com))

    if (resultTable[com][user] == 'W') {
        println("You win!\n")
    } else if (resultTable[com][user] == 'L') {
        println("You lose!\n")
    } else {
        println("It's a tie!\n")
    }
}

fun main() {

    var computerChoice = 0
    var playerChoice = 0

    while (playerChoice != 3) {
        println("==========================================")
        println("ROCK PAPER SCISSORS ! ")
        println("0 : ROCK\t1 : SCISSORS\t2 : PAPER\n3 : EXIT")
        println("==========================================")
        playerChoice = readln().toInt()
        computerChoice = Random.nextInt(0, 3)// (0..2).random()

        if (playerChoice == 3) {
            println("GG!\n")
            break
        }

        if (playerChoice == 0 || playerChoice == 1 || playerChoice == 2) {
            printResult(playerChoice, computerChoice)
        } else {
            println("You need to pick between 0/1/2\n Try again\n")
        }
    }

}