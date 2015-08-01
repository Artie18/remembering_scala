import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * Created by Artie on 8/1/15.
 */
object Eye {
  val possibleColors:mutable.ArrayBuffer[String] =
    ArrayBuffer[String]("Brown", "Blue", "Brown")


  def isColorAccepted(colorc:String):Boolean = {
    if(Eye.possibleColors contains colorc) true else false
  }
}

class Eye(colorc:String) {

  private var _color:String = ""

  // Call set color method as part of costructor
  setColor(colorc)

  protected def setColor(colorc:String) = {
    if(Eye.possibleColors contains colorc) {
      _color = colorc
    } else {
      _color = ""
    }
  }

  def color:String = _color

}
