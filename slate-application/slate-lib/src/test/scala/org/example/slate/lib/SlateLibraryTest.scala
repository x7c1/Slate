package org.example.slate.lib

import org.scalatest.{FunSpec, Matchers}

class SlateLibraryTest extends FunSpec with Matchers {

  describe(SlateLibrary.getClass.getSimpleName){
    it("should create message"){
      val message = SlateLibrary createMessageFor "earthlings"
      message should be("hello, earthlings!")
    }
  }
}

