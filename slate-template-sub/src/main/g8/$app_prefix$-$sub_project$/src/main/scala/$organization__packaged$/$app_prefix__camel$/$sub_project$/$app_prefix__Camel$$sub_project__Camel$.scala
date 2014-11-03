package $organization$.$app_prefix$.$sub_project$

object $app_prefix;format="Camel"$$sub_project;format="Camel"$ {
  def createMessageFor(name: String) = s"hello, \$name on $sub_project$!"
}

