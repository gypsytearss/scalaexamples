package com.gypsytearss.scala_examples.leetcode

object LongestNonRepeatingSubstring {
  def lengthOfLongestSubstring(s: String): Int = {
    var maxLength = 0
    var charSet: Set[Char] = Set()
    var charQueue: Vector[Char] = Vector()

    s.toList.foreach { ch =>
      if (!charSet.contains(ch)) {
        charSet = charSet + ch
        charQueue = ch +: charQueue
        if (charQueue.size > maxLength)
          maxLength = charQueue.size
      }
      else {
        var poppedChar: Option[Char] = None
        while (!poppedChar.contains(ch)) {
          poppedChar = charQueue.lastOption
          charQueue = charQueue.slice(0, charQueue.size - 1)
          charSet = charSet - poppedChar.get
        }
        charSet = charSet + ch
        charQueue = ch +: charQueue
      }
    }
    maxLength
  }

}
