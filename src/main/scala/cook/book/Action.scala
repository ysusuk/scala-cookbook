package cook.book


trait UndoableAction {
  val description: String

  def undo(): Unit

  def redo(): Unit
}

object DoNothingAction extends UndoableAction {
  override val description: String = "do nothing"

  override def undo() {}

  override def redo() {}
}

case object DoSomething extends UndoableAction {
  override val description: String = "do something"

  override def undo() {}

  override def redo() {}
}