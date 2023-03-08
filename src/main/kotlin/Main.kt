fun main() {
//val banker = Banker("Nancy", 45)
//                          //println(banker.name)
//                           //println(banker.age)
//    banker.talk("Hello Customer")
//    banker.eat()
//    banker.sleep()
//    banker.countMoney(arrayOf(100,100,500,50,200))
//
//    val nurse = Doctor("Purity",34)
//    nurse.talk("How are you feeling today ")
//    nurse.eat()
//    nurse.sleep()
//    nurse.treatPatient("Amina", "Malaria")
//
//    val farm = Farmer("Gubo",50)
//     farm.talk("when will it rain?")
//    farm.eat()
//    farm.sleep()
//    farm.cultivateLand()

    val nurse= Doctor("June", 43, )
    nurse.eat()
    nurse.introduction()

    val banker = Banker("Joseph", 67)
    banker.eat()
    banker.introduction()


    val farm = Farmer("Jane",78)
    farm.eat()
    farm.introduction()
}
//MAIN CLASS WITH ALL PROPERTIES(base class)
//super class is Person(we inherit from it) Banker,farmer,doctor becomes subclass.
// a class can be a super and subclass when there is hierarchical inheritance, whereby banker inherits from doctor, doctor
// inherits from person.
// what is defined by the parent (attributes)a child must have ,but the child could have more attributes and properties
//not owned by the parent.
 open class Person(var name :String, var age: Int){
    fun talk(words: String) {
        println(words)
    }

   open fun eat() {
        println("yum")
    }

    fun sleep() {
        println("zzzzz")
    }
     open fun introduction(){
        println("hello my name is $name")
    }
}


class Banker( name:String, age: Int) : Person(name,age){ // we said it will inherit its properties from class person
                       // MAKE THE PARENT CLASS OPEN = OPEN CLASS PERSON
                      // WE HAVE REMOVE THE VAR KEYWORDS INSIDE BANKER TO AVOID REDECLARING;;for the child class to be able to use the same properties.
//    fun talk(words:String){
//        println(words)
//    }
//    fun eat(){                                    DELETE ALL.
//        println("yum")
//    }
//    fun sleep(){
//        println("zzzzz")
//    }
    fun countMoney(notes: Array<Int>) : Int{
        return notes.sum()
    }
}

class Doctor(name :String,  age:Int,) : Person(name,age) {
//    fun talk(words: String) {
//        println(words)
//    }
//                                           // DELETE ALL SO THAT IT COPIES FROM PERSON
//    fun eat() {
//        println("yum")
//    }
//
//    fun sleep() {
//        println("zzzzz")
//    }
    fun treatPatient(patientName :String, disease:String){
        println("Treating $patientName for $disease")

    }

    override fun introduction() {
        super.introduction()
        println("Hi, my name is doctor $name")
    }
}
  class Farmer ( name:String,  age: Int):Person(name,age){
//    fun talk(words: String) {
//        println(words)
//    }
//
//    fun eat() {
//        println("yum")
//    }
//
//    fun sleep() {
//        println("zzzzz")
//    }
    fun cultivateLand(){
        println("dig, dig, dig")
    }
    override fun eat(){
       // super.eat()  *// on commenting it out it ignores everything in the parent class(person)
        // when not commented out it first prints out what was in the parent then the next set of instructions
        println("I am eating beans from my farm")
    }
}