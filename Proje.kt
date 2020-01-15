package com.example.myapplication


import java.io.PrintStream
import java.util.Scanner
import java.util.*

fun main (args : Array<String>)
{
   val collectionList: List<Int?> = listOf(1,2,null,3)
   val collectionList1: List<Int> = collectionList.filterNotNull()
   println("collectionlist =" +collectionList)
   println("collectionlist1 =" +collectionList1)

}
