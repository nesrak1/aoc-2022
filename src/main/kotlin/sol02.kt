import java.io.File

fun sol02A(args: Array<String>) {
    var score = 0
    File("input_02.txt").readLines().forEach {
        val spl = it.split(" ")
        val opp = spl[0][0] - 'A'
        val you = spl[1][0] - 'X'
        var roundScore = when (opp) {
            you -> 3
            (you+1)%3 -> 0
            else -> 6
        }
        roundScore += you + 1
        score += roundScore
    }
    println("score: $score")
}

fun sol02B(args: Array<String>) {
    var score = 0
    File("input_02.txt").readLines().forEach {
        val spl = it.split(" ")
        val opp = spl[0][0] - 'A'
        val youMove = spl[1][0] - 'X'
        var you: Int
        var roundScore: Int
        you = (opp + ((youMove+2)%3)) % 3
        if (opp == you) {
            roundScore = 3
        } else if ((you+1)%3 == opp) {
            roundScore = 0
        } else {
            roundScore = 6
        }
        roundScore += you + 1
        score += roundScore
    }
    println("score: $score")
}