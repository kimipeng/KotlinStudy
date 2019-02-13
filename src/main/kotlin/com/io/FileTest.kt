package com.io

import java.io.File

fun main(args: Array<String>) {
    //

   //write()

    File("data.txt").bufferedReader().lines().forEach {
        println(it)
    }

}

private fun write() {
    File("output.txt").writeText("abc123")

    File("output.txt").printWriter().use {
        it.println("1st line")
        it.println("2nd line")
        it.println("3rd line")
    }

    File("output_buffer.txt").bufferedWriter().use {
        it.write("1st line\n")
        it.write("2nd line\n")
        it.write("3rd line\n")
    }
}