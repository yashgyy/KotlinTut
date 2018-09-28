fun main(args:Array<String>){
    fun hello(){
        print("Hello World")
    }

    fun addTwoNumber(number1:Int ,number2:Int):Int{                  //Type parametr required

        return number1+number2
    }

    fun Add(name:String,age:Int):String{
        return name+age   //String Rules same as Java
    }

    Add("Asd",233)


    class Dog () {  //Empty Constructor defined
        var name=""
        var age=0
        var furcolor=""

        fun dogInfo():String{
            return name+age+furcolor
        }

    }

    class Laptop(){
        var price : Int=0
        var Model: String=""
        var HaveGraphicCard: Boolean=false

        fun ShowPrice(): Int{
            return price
        }
    }

    var x=Laptop()
    x.price=12
}