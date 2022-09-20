package example.myapp

class Aquarium {
    private var width: Int = 20
    var height = 40
    private var length = 100

    fun printSize() {
        println(
            "Width: $width cm " +
            "Length: $length cm " +
            "Height: $height cm "
        )
    }
}