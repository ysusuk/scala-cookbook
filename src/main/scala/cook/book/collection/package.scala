package cook.book

import scala.collection.mutable
import scala.collection.mutable.{Map}
import scala.collection.immutable

/**
 * @author Yura.Susuk yurasusuk@gmail.com.
 */
package object collection {

  def indexesFold(in: String): immutable.Map[Char, immutable.TreeSet[Int]] = {
    val inWithIndex = in.zipWithIndex
    (immutable.Map[Char, immutable.TreeSet[Int]]() /: inWithIndex)(
      (m: immutable.Map[Char, immutable.TreeSet[Int]], tup: (Char, Int)) => m + (tup._1 -> (m.getOrElse(tup._1, immutable.TreeSet[Int]()) + tup._2))
    )
  }

  def indexes(in: String): immutable.Map[Char, immutable.TreeSet[Int]] = {
    val inWithIndexes = in.zipWithIndex
    inWithIndexes
      .groupBy(_._1)
      .map(tup => {
      tup._1 -> (immutable.TreeSet[Int]() ++ tup._2.map(_._2).toSet)
    })

  }

  def indexesM(in: String): Map[Char, mutable.TreeSet[Int]] = {
    val map = Map[Char, mutable.TreeSet[Int]]()

    val inWithIndexes = in.zipWithIndex
    inWithIndexes foreach {
      tup => map.getOrElseUpdate(tup._1, mutable.TreeSet()) += tup._2
    }

    map
  }
}


