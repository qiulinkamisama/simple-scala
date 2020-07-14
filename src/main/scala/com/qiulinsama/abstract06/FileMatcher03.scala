package com.qiulinsama.abstract06

import java.io.File

object FileMatcher03 {
  private def filesHere = (new File(".")).listFiles

  def filesMatching(matcher: String => Boolean) = {
    for(file <- filesHere; if matcher(file.getName))
      yield file
  }

  def filesEnding(query: String) =
    filesMatching(_.endsWith(query))
  def filesContaining(query: String) =
    filesMatching(_.contains(query))
  def filesRegex(query: String) =
    filesMatching(_.matches(query))

  def containsNeg(nums: List[Int]) = nums.exists(_<0)
}
