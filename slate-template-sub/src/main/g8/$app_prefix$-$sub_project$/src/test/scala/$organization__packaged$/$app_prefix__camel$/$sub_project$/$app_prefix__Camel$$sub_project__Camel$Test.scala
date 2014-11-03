package $organization$.$app_prefix$.$sub_project$

import org.specs2.mutable.Specification

object $app_prefix;format="Camel"$$sub_project;format="Camel"$Test extends Specification {

  $app_prefix;format="Camel"$$sub_project;format="Camel"$.getClass.getSimpleName should{
    "create message" in {
      val message = $app_prefix;format="Camel"$$sub_project;format="Camel"$ createMessageFor "earthlings"
      "hello, earthlings on $sub_project$!" === message
    }
  }
}

