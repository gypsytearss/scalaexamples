package com.gypsytearss.scala_examples.leetcode

object AddStrings {

  case class Result(bin: String, carry: Int) {
    def assemble: String = {
      if (carry == 1)
        Integer.parseInt((bin + carry.toString).reverse, 2).toString
      else
        Integer.parseInt(bin.reverse, 2).toString
    }
  }

  def addStrings(num1: String, num2: String): String = {
    val binStrings = Seq(num1, num2).map(_.toInt.toBinaryString.reverse)

    val res = binStrings.head.zipAll(binStrings(1),'0','0').foldLeft(Result("", 0)) { (res, z) =>
      val (a, b) = z
      val thisDigit = Seq[Any](a,b,res.carry).map(_.toString.toInt)
      Result(res.bin + (thisDigit.sum % 2).toString, (thisDigit.sum / 2))
    }

    res.assemble
  }
}
