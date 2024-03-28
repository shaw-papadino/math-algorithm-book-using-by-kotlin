package chapter_2

import java.util.*

object Code_2_01_3 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)

        val n = sc.nextInt()

        val answer = (1..n).fold(0) { acc, _ ->
            acc + sc.nextInt()
        }

        println(answer)
    }
}