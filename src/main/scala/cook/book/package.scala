package cook

/**
 * @author Yura.Susuk yurasusuk@gmail.com.
 */
package object book {
  import java.util.{HashMap => JavaHashMap, HashMap => _}

  implicit class StringExt1(val s: String) {
    def mew = "mew - mew!"
  }
}
