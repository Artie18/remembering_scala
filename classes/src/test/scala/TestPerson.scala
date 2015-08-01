/**
 * Created by Artie on 8/1/15.
 */

import org.scalatest.FunSuite

class TestPerson extends FunSuite {
  test("Person should be created without errors") {
    val person: Person = new Person("Jake")
  }

  test("Name should be setted and getted for Person class") {
    val name: String = "Sting"
    val person: Person = new Person(name)
    assert(person.name === name)
  }

  test("Eyes must be set and retrived") {
    val (rightEye:String, leftEye:String) = ("Brown", "Brown")
    val person:Person = new Person("Jeff")
    person.createEyes(Array(rightEye, leftEye))
    assert(person.rightEye.color === rightEye && person.leftEye.color === leftEye)
  }

}
