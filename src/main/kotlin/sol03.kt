import java.io.File

fun sol03A(args: Array<String>) {
    var sum = 0
    File("input_03.txt").readLines().forEach {
        val lineLenHalf = it.length / 2
        val lineA = it.substring(0 until lineLenHalf)
        val lineB = it.substring(lineLenHalf)
        var matchingChar = 0.toChar()
        lineA.forEach { c -> if (lineB.contains(c)) matchingChar = c }
        sum += when (matchingChar) {
            in 'a'..'z' -> matchingChar - 'a' + 1
            in 'A' .. 'z' -> matchingChar - 'A' + 27
            else -> {
                println("couldn't find matching char")
                return
            }
        }
    }
    println("sum: $sum")
}

fun sol03B(args: Array<String>) {
    var sum = 0
    val lines = File("input_03.txt").readLines()
    for (i in lines.indices step 3) {
        val elfA = lines[i].toCharArray().toSet()
        val elfB = lines[i+1].toCharArray().toSet()
        val elfC = lines[i+2].toCharArray().toSet()
        val matchingChars = elfA.intersect(elfB).intersect(elfC)
        if (matchingChars.size != 1) {
            println("couldn't find single matching char")
            return
        }
        val matchingChar = matchingChars.first()
        sum += when (matchingChar) {
            in 'a'..'z' -> matchingChar - 'a' + 1
            in 'A' .. 'z' -> matchingChar - 'A' + 27
            else -> {
                println("couldn't find matching char")
                return
            }
        }
    }
    println("sum: $sum")
}