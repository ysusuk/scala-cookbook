package cook.book

trait Mock

trait Logged {
  def log(msg: String) {}
}

trait ConsoleLogger extends Logged {
  override def log(msg: String) {
    println(msg)
  }
}

trait TimestampLogger extends Logged {
  override def log(msg: String) {
    super.log(new java.util.Date() + " " + msg)
  }
}

trait ShortLogger extends Logged {
  val maxLength = 15

  override def log(msg: String) {
    super.log(
      if (msg.length <= maxLength) msg else msg.substring(0, maxLength - 3) + "..."
    )
  }
}

abstract class Account(val balance: Double)

class SavingsAccount extends Account(balance = 0.0) with Logged {

  def withdraw(amount: Double) {
    if (amount > balance) log("Insufficient funds")
    else println("done")
  }
}

/**
 * Traits chaining looks like chain of resp pattern.
 */
object TraitsExercises extends App {

  (new SavingsAccount with ConsoleLogger).withdraw(1)

  // log method is invoked starting from the last trait defined
  val acct1 = new SavingsAccount with ConsoleLogger with
    TimestampLogger with ShortLogger
  acct1.withdraw(1)

  val acct2 = new SavingsAccount with ConsoleLogger with
    ShortLogger with TimestampLogger
  acct2.withdraw(1)
}
