import java.io.File

fun sol01A(args: Array<String>) {
    var curMax = 0
    var curChk = 0
    val tops = ArrayList<Int>()
    File("input.txt").readLines().forEach {
        if (it.trim() == "") {
            tops.add(curChk)
            if (curChk > curMax) {
                curMax = curChk
            }
            curChk = 0
        } else {
            curChk += it.toInt()
        }
    }
    if (curChk > curMax) {
        curMax = curChk
    }

    tops.sort()
    val top3Sum = tops.slice(tops.size - 3 until tops.size).sum()

    println("part a: $curMax")
    println("part b: $top3Sum")
}