// Базовый абстрактный класс для трехмерной фигуры
abstract class ThreeDimensionalShape {
    // Абстрактная функция для вычисления объема
    abstract fun volume(): Double

    // Абстрактная функция для вычисления площади основания
    abstract fun baseArea(): Double
}

// Класс для куба
class Cube(private val side: Double) : ThreeDimensionalShape() {
    // Вычисление объема куба
    override fun volume() = side * side * side

    // Вычисление площади основания куба
    override fun baseArea() = side * side
}

// Класс для цилиндра
class Cylinder(private val radius: Double, private val height: Double) : ThreeDimensionalShape() {
    // Вычисление объема цилиндра
    override fun volume() = Math.PI * radius * radius * height

    // Вычисление площади основания цилиндра
    override fun baseArea() = Math.PI * radius * radius
}

// Класс для сферы
class Sphere(private val radius: Double) : ThreeDimensionalShape() {
    // Вычисление объема сферы
    override fun volume() = (4.0 / 3.0) * Math.PI * radius * radius * radius

    // Вычисление площади основания сферы не применимо, но можно вычислить площадь поверхности
    override fun baseArea(): Double {
        throw NotImplementedError("Base area is not applicable for sphere")
    }
}

// Пример использования
fun main() {
    val cube = Cube(3.0)
    println("Объем куба: ${cube.volume()}") // Вывод: Объем куба: 27.0
    println("Площадь основания куба: ${cube.baseArea()}") // Вывод: Площадь основания куба: 9.0

    val cylinder = Cylinder(2.0, 5.0)
    println("Объем цилиндра: ${cylinder.volume()}") // Вывод: Объем цилиндра: 62.83185307179586
    println("Площадь основания цилиндра: ${cylinder.baseArea()}") // Вывод: Площадь основания цилиндра: 12.566370614359172
}