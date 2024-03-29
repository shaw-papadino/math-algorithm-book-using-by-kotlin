package chapter_2

import java.util.*
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

object Code_2_02_1 {
    @JvmStatic
    fun main(args: Array<String>) {
        // 四足演算
        println(869 + 120)
        println(869 - 120)
        println(869 * 120)
        println(869 / 120)

        // mod
        println(8 % 5)
        println(869 % 120)

        // abs
        println(abs(-45))
        println(abs(15))

        // pow
        println(10.0.pow(2.0).toInt())
        println(3.0.pow(4.0).toInt())

        // sqrt
        println(sqrt(4.0))
        println(sqrt(2.0))
    }
}