package org.example.app01
package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2
  println(x)

  println(2 + 3 * 4 << 2)

  var aVariable = 2
  aVariable += 3
  println(aVariable)

  // instructions vs expressions

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)

}
