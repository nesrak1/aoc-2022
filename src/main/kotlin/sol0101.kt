import java.io.File

fun sol01A(args: Array<String>) {
    var curChk = 0
    val tops = ArrayList<Int>()
    File("input_01.txt").readLines().forEach {
        if (it.trim() == "") {
            tops.add(curChk)
            curChk = 0
        } else {
            curChk += it.toInt()
        }
    }
    tops.add(curChk)

    tops.sortDescending()
    val top1 = tops[0]
    val top3Sum = tops.slice(0 until 3).sum()

    println("part a: $top1")
    println("part b: $top3Sum")
}