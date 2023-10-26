fun main() {

    /*
    val str = readln().split(",")
    val map = mutableMapOf<String,Int>()
    for(v in str) {
        val res = v.split(" ")
        map.put(res[0],res[1].toInt())
    }
    val buy = readln().split(" ")
    */
    val goods = readln().replace(",","").split(" ").chunked(2)
    println(goods)
    val shop = readln().split(" ")
    val map = goods.map {
        it[0] to it[1].toInt()
    }
    println(map)
    val res = map.filter { (k, v) -> k in shop }.map { it.second }.sum()
    println(res)

}