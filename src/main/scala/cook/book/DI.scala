package cook.book

/**
 * Cake pattern
 * @author Yura.Susuk yurasusuk@gmail.com.
 */

abstract trait LoggerComponent {

  trait Logger {
    def log(msg: String)
  }

  val logger: Logger

  class FileLogger(file: String) extends Logger {
    override def log(mst: String) {}
  }

}

abstract trait AuthComponent {
  this: LoggerComponent =>

  trait Auth {
    def login(id: String, password: String): Boolean
  }

  val auth: Auth

  class MockAuth(file: String) extends Auth {

    override def login(id: String, password: String): Boolean = {
      true
    }
  }

}

object AppComponents extends LoggerComponent with AuthComponent {
  val logger = new FileLogger("test.log")
  val auth = new MockAuth("users.txt")
}