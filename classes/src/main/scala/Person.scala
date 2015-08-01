/**
 * Created by Artie on 8/1/15.
 */
class Person(namec: String) extends Face {
  private val _name: String = namec
  var _eyes:Map[String, Eye] = Map()

  override def createEyes(colorsc:Array[String]):Map[String, Eye] = {
    _eyes = Map("right" -> new Eye(colorsc(0)), "left" -> new Eye(colorsc(1)))
    return _eyes
  }

  def name = _name

  def getEyesAsString:String = {
    s"Right Eye Color: ${rightEye.color}, Left Eye Color: ${leftEye.color}"
  }

}
