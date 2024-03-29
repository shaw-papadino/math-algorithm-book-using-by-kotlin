package chapter_2.problem

import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

object Code_2_02_4 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)

        val n = sc.nextInt()

        val answer = (1..n).fold(0) { acc, _ ->
            acc + sc.nextInt()
        }

        println(answer % 100)
    }
}