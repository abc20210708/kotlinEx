package chap05.section4

import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter

fun main() {

    PrintWriter(FileOutputStream("d:\\test\\output.txt")).use {
        it.println("hello")
    }

}