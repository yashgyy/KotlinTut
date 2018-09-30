fun main(args: Array<String>){

    var n=4

    print(n>3)

    val day=1

    var dayString:String

    when(day){    //Switch Case  Here

        1 -> dayString="Monday"
        2 -> dayString="Tuesday"

        else -> dayString="Wednesday"
    }

    val mynumber = intArrayOf(21,12,34)

    for(number in mynumber) {
        print(number)//New Variiable
    }

    for(i in mynumber.indices){
        print(mynumber[i])
    }

    while(n<10){  //N var
        n++
    }


}
