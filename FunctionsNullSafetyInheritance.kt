fun main(args: Array<String>){
    test()
    var age :Int?  //Nullable Safety Can be Null and we didnt know

    var age1:Int ??
}

fun test(){
    val x=5
    print(x)
    Test1(1)
    Sum().div(2)


}

fun Test1(a:Int):Int {  // Return Type with colon
    return a
}

fun makeSimpson(){
    val homer=Simpson("Name1",20,"Scentist")
    homer.age=90
}

class Sum:Div(){  //Inherited
    fun sum(a:Int):Int{
        return 1
    }
}

open class Div{  //Open for inheriting
    fun div(a:Int):Int{
        return 1/2
    }
}