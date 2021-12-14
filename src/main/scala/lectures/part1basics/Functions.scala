package org.example.app01
package lectures.part1basics

import scala.annotation.tailrec

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("Hello", 3))

  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())

  def aRepeatedFunction(aString: String, n: Int): String = {
    if(n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }
  println(aRepeatedFunction("Hello",3))

  def aFunctionWithSideEffects(a: String): Unit = {
    println(a)
  }

  aFunctionWithSideEffects("Bananas")

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int =
      a + b

    aSmallerFunction(n, n - 1)
  }

  /*
  exercises:
  1. a greeting function for kids
  a name, an age
  - "Hi my name is $name and I am $age years old"

  2. Factorial function 1 * 2 * 3 * 4 * 5 .. * n

  3. Fibonacci function.
    f(1) = 1
    f(2) = 1
    f(n) = f(n - 1) + f(n - 2)

  4. Write a function that tests if a number is prime.
  */

  def aGreeting(name: String, age: Int): String = {
    s"Hi, my name is $name and I am $age years old"
  }
  println(aGreeting("Daniel", 32))

  def factorial(n: Int): Int = {
    @tailrec
    def loop(innerN: Int, acc: Int = 1): Int = {
      if(innerN <= 1) acc
      else loop(innerN - 1, innerN * acc)
    }
    loop(n)
  }
  println(factorial(5))

  /*
    3. Fibonacci function.
    f(1) = 1
    f(2) = 1
    f(n) = f(n - 1) + f(n - 2)
*/
  def fib1(n: Int): Int = {
    def loop(innerN: Int) : Int = {
      if(innerN == 1) 1
      else if(innerN == 2) 1
      else loop(innerN - 1) + loop(innerN - 2)
    }
    loop(n)
  }
  println("1 = " + fib1(1))
  println("2 = " + fib1(2))
  println("3 = " + fib1(3))
  println("4 = " + fib1(4))
  println("5 = " + fib1(5))
  println("6 = " + fib1(6))
  println("7 = " + fib1(7))
  println("8 = " + fib1(8))

  def isPrime(n: Int) : Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if(t <= 1) true
      else (n % t != 0) && isPrimeUntil(t - 1)
    }
    isPrimeUntil(n / 2)
  }
  println("37 = " + isPrime(37))
  println("2003 = " + isPrime(2003))
  println("37 * 17 = " + isPrime(37 * 17))
}
