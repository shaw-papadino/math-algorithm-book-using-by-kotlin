package chapter_2

import java.util.*

object Code_2_02_2 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val a = sc.nextInt()
        val b = sc.nextInt()

        println(a and b)

        println(a or b)

        println(a xor b)
    }
}