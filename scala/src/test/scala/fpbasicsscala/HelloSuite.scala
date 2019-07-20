package fpbasicsscala

import org.scalatest.FunSuite

class HelloSuite extends FunSuite {

  test("Hello + World should give 'Hello World'") {
    val greeting = "Hello" + " World"
    assert(greeting == "Hello World")
  }

}
