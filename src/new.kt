fun main(args : Array<String>) {
    var myArray = Array<Int>(5) {0}

    var myMap = mapOf<Int, String>(4 to "Gayal", 43 to "Sandun", 2 to "Mihan")

    for(key in myMap.keys) {
        println(myMap[key])
    }

//    for(index in 0..list.size-1) {
//        println(list[index])
//    }
}