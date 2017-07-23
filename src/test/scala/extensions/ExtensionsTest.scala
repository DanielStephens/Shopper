package extensions

import extensions.Extensions.richSeq
import org.scalatest.FunSuite
import org.scalatest.Matchers._
import org.scalatest._

class ExtensionsTest extends FunSuite {

  test("RichSeq removes 1 element if matched"){
    val values = List(1, 2, 3)

    val answer = values.removeFirst(_ == 2)

    assert(answer.size === 2, "Should only contain 1 and 3 since 2 should have been removed")
    answer should contain (1)
    answer should contain (3)
  }

  test("RichSeq removes 0 element if none matched"){
    val values = List(1, 2, 3)

    val answer = values.removeFirst(_ == 4)

    assert(answer.size === 3, "Should still contain 1, 2 and 3")
    answer should contain (1)
    answer should contain (2)
    answer should contain (3)
  }

  test("RichSeq removes 1 element if lots match"){
    val values = List(1, 2, 2, 3)

    val answer = values.removeFirst(_ == 2)

    assert(answer.size === 3, "Should still contain 1, 2 and 3")
    answer should contain (1)
    answer should contain (2)
    answer should contain (3)
  }

  test("RichSeq removes 1 element at tail"){
    val values = List(1, 3, 2)

    val answer = values.removeFirst(_ == 2)

    assert(answer.size === 2, "Should only contain 1 and 3 since 2 should have been removed")
    answer should contain (1)
    answer should contain (3)
  }

}
