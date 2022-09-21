package example.myapp

fun main(args: Array<String>) {

    var hashMap : HashMap<String, Int>
            = HashMap<String, Int> (4)

    hashMap.put("IronMan" , 3000)
    hashMap.put("Thor" , 100)
    hashMap.put("SpiderMan" , 1100)
    hashMap.put("NickFury" , 1200)

    for(key in hashMap.keys) {
        println("Element at key $key : ${hashMap[key]}")
    }
    println("\n" + "hashMap.size : " + hashMap.size )

    hashMap["BlackWidow"] = 1000;
    println("hashMap.size : " + hashMap.size + "\n")

    for(key in hashMap.keys) {
        println("Element at key $key : ${hashMap[key]}")
    }
}









