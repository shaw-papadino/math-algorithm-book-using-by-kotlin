package chapter_2

import java.util.*


// 可視性の修飾子. internalをつけると同じモジュール内でのみ扱える.
internal object Code_2_01_1 {
    // オブジェクトやクラス内メソッドを静的メソッドとして宣言するためのアノテーション
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val n = sc.nextInt() // 入力部分
        println(5 + n) // 出力部分
    }
}