package chapter_2

import java.util.*

object Code_2_01_4 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val n = sc.nextInt()

        println(toBinaryString(n))
    }

    // tailrec修飾子をつけて、再帰処理の条件を満たすとcompilerが再帰処理を最適化してくれる.
    private tailrec fun toBinaryString(n: Int, answer: String = ""): String {
        // Kotlinもif式なので、returnでif式の結果を返している.
        if (n == 0) return (if (answer.isEmpty()) "0" else answer)
        val bit = if (n % 2 == 0) "0" else "1"
        return toBinaryString(n / 2, bit + answer)
    }
}