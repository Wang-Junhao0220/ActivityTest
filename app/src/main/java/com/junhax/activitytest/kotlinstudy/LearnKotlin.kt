package com.junhax.activitytest.kotlinstudy

import java.util.Scanner


fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = sc.nextLong()
    if (b2041(a, b)) {
        println(1)
    } else {
        println(0)
    }
}

/**
 * Luogu B2007
 * @author Junhax
 * @param a One number
 * @param b Another number
 * @return The ans of a and b
 */
fun b2001(a: Int, b: Int): Int {
    return a + b
}

/**
 * Luogu B2002
 * @author Junhax
 */
fun b2002() {
    println("Hello,World!")
}

/**
 * Luogu B2005
 * @author Junhax
 */
fun b2005(a: String) {
    println("  $a  ")
    println(" $a$a$a ")
    println("$a$a$a$a$a")
}

/**
 * Luogu B2007, actually as same as the B2001, but Long
 * @author Junhax
 * @param a One number
 * @param b Another number
 * @return The ans of a and b
 */
fun b2007(a: Long, b: Long): Long {
    return a + b
}

/**
 * Luogu B2028
 * @param a A String
 * @author Junhax
 */
fun b2028(a: String) {
    println(a.reversed())
}

/**
 * Luogu B2033
 * @param a A integer
 * @param b Another integer
 * @return The answer of calculate
 * @author Junhax
 */
fun b2033(a: Long, b: Long): Long {
    return a * b
}

/**
 * Luogu B2041
 * @param m Amount of "Luck"
 * @param n Amount of "Encouragement"
 * @return Can be rewarded or not
 * @author Junhax
 */
fun b2041(m: Long, n: Long): Boolean {

    /**
     * Luck
     */
    fun b2041Luck(m: Long): Boolean {
        return m >= 10
    }

    /**
     * Encouragement
     */
    fun b2041Encouragement(n: Long): Boolean {
        return n >= 20
    }
    return b2041Luck(m) or b2041Encouragement(n)
}
