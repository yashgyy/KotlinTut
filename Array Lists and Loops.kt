fun main(args:Array<String>){

    var list: List<String> = listOf("Hello","Yasj") // Cant change or add anything

    var list1:Array<String> = arrayOf("Hey","There")

    list1[0] =" nigh" // cant add but change

    var movies: MutableList<String> = mutableListOf("Him","Right")

    movies.add(2,"Chna") // Add and can be changed

    movies.add("C112hna")

    for (bob in 5..8){
        print(bob)
    }

    for (charles in movies){
        print(charles)
    }

    for (hero in 0..movies.size-1){
        print(hero)
    }

    

}