package subjects

import subjects.functional.MapFlatmapFilterFor_7.list

object Ejercicio0 extends App {

  case class Person(name: String, age: Int)

  val bob = Person("Bob", 20)

  val greeting = bob match {
    case Person(n, a) if a < 18 => s"Hi, my name is $n and I can't drink in Mexico"
    case Person(n, a) => s"Hi, my name is $n and I am $a years old"
    case _ => "I don't know who I am"
  }

  println(greeting)

}

object Ejercicio1 extends App {
  //Dada la siguiente lista cuales serian los resultados
  val list = List(1, 2, 3)

  //Resultado A:
  println(list.map(_ + " is a number"))

  //Resultado B:
  println(list.map(_ * 2))
}

object Ejercicio2 extends App {

  val numbers = List(1, 2, 3, 4)
  val chars = List('a', 'b', 'c', 'd')
  val colors = List("black", "white")

  val resp = for {
    n <- numbers if n % 2 == 0
    c <- chars
    color <- colors
  } yield "" + c + n + "-" + color

  println(resp)

}

object Ejercicio3 extends App {

  val paths: List[String] = List(
    "C:/Users/resources/data/output/countriesPart.parquet/date=1671658500",
    "C:/Users/resources/data/output/countriesPart.parquet/date=1671658505",
    "C:/Users/resources/data/output/countriesPart.parquet/date=1671658510"
  )

  val resp = paths.map(x => (x, x.split("=").last.toLong))
    .sortWith(_._2 > _._2)
    .head

  println(resp)
}