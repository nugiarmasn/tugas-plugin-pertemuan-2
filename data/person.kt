package data

class person {

    var firstName : String = "armas"
    var middleName : String? = null
    var LastName : String = "Nugi"


    // membuat sebuah function
    fun sayHello(name:String) {
        println("Hello $name my name is $firstName ")
    }

    fun run(){
        println("I'am run")

    }

    fun getfullName(): String{
        return "$firstName $middleName $LastName"
    }

}