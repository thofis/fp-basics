package fpbasicsscala

import org.scalatest.FunSuite

class FirstClassCitizenSuite extends FunSuite {

  test("functions as first class citizen in Scala") {
    val number = 42
    val obj = new Object

    val isEven: Int => Boolean = _ % 2 == 0

    def negate(predicate: Int => Boolean): Int => Boolean = {
      !predicate(_)
    }

    assert(isEven(0))
    assert(!isEven(1))

    val isOdd = negate(isEven)

    assert(isOdd(1))
    assert(!isOdd(2))
  }

}
