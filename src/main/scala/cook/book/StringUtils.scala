package cook.book

/**
 * @author Yura.Susuk yurasusuk@gmail.com.
 */
object StringUtils {

  implicit class StringExt(val s: String) {
    def bark = "bark - bark!"

    def quack = "quack - quack!"
  }

}
