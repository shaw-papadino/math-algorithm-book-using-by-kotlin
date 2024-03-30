package chapter_2

import java.util.*

object Code_2_04_2 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val n = sc.nextInt()
        val x = sc.nextInt()
        val y = sc.nextInt()

        var count = 0
        for (i in 1..n) {
            if (i % x == 0 || i % y == 0 ) count ++
        }

        println(count)
    }
}