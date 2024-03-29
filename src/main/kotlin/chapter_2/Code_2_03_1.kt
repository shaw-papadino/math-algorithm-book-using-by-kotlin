package chapter_2

object Code_2_03_1 {
    var cnt = 1000
    private fun func1(): Int {
        return 2021;
    }
    private fun func2(pos: Int): Int {
        cnt += 1
        return cnt + pos
    }
    @JvmStatic
    fun main(args: Array<String>) {
        println(func1())
        println(func2(500))
        println(func2(500))
    }
}