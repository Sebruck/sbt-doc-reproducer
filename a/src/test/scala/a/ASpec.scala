package a

import b.TestUtils
import org.scalatest.FlatSpec

class ASpec extends FlatSpec {

  it should "log" in {
    TestUtils.log("a")
  }
}
