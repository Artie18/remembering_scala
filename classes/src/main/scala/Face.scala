/**
 * Created by Artie on 8/1/15.
 */



trait Face {
  var _eyes:Map[String, Eye]

  def createEyes(colorsc:Array[String]):Map[String, Eye] = {
    Map("right" -> new Eye(colorsc(0)), "left" -> new Eye(colorsc(1)))
  }

  def rightEye:Eye = {
    _eyes("right")
  }

  def leftEye:Eye  = {
    _eyes("left")
  }

  def getEyesAsString:String


}
