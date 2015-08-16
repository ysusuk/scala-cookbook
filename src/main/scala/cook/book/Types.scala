package cook.book

/**
 * @author Yura.Susuk yurasusuk@gmail.com.
 */


object Types extends App {

  def close(canClose: {def close(): Unit}) = {
    canClose.close()
  }

  class Logger
  class FileLogger {
    def close() {
    }
  }

  close(new FileLogger)
  //close(new Logger)
}
