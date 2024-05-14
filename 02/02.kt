fun main() {
  val list = listOf("bike", "car", "helicopter", "plane", "car", "plane", "scooter")
  println(list.groupingBy { it }.eachCount().filter { it.value > 1 })
}