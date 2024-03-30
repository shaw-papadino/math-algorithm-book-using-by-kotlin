package chapter_2

import java.util.*

object Code_2_04_3 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val n = sc.nextInt()
        val s = sc.nextInt()

        var count = 0
        for (i in 1..n) {
            for (j in 1..n) {
                if (i + j <= s ) count ++
            }
        }

        println(count)
    }
}