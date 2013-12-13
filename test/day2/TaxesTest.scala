package day2

import org.specs2.mutable.Specification

class TaxesTest extends Specification {

  "Tax calculator" should {
    "round up" in{
          object x extends Rounding
          x.up(100.2) mustEqual 101
          x.down(100.2) mustEqual 100
    }
  }

}
