fun main(args:Array<String>) {


    var x = 12.0.toInt()

    var y = 12.toDouble()

// Strings

    val name = "James"

    print(name)

   // print(1+2+"Hello") Wont Compile

    print("Hello"+1+2) //Compiles

    //array

    val mynumberArray= intArrayOf(10,20,30,40,50)

    mynumberArray.get(2)

   mynumberArray.set(2 ,3) // Can change but cant add

    // List kind of Array List

    val myMusician=ArrayList<String>()
    myMusician.add("Hello")
    myMusician.add("Him")
    myMusician.add(2,"There")
    println(myMusician)

    // Set Unique

    val mySet= HashSet<String>()

    mySet.add("Him")
    mySet.add("There")

    // Maps Like Dictionaru

    var HashMap1 = HashMap<String,String>()

    HashMap1.put("Him","Achoo")
    HashMap1.put("Him","Yash")

    print(HashMap1["Him"])  // only Unique

    


}