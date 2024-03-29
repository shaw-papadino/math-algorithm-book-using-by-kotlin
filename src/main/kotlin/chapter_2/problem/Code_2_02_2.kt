package chapter_2.problem

import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

object Code_2_02_2 {
    @JvmStatic
    fun main(args: Array<String>) {

        println(sqrt(841.0))
        println(29.0.pow(2).toInt())

        // 累乗根を求めるためにpowを使った
        println(1024.0.pow(1.0 / 5))
        println(4.0.pow(5))
    }
}