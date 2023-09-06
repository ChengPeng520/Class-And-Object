import java.util.*

class Dog(
    val name: String,
    weightParam: Int,
    breedParam: String
) {
    init {
        print("Dog $name has been created. ")
    }

    var activities = arrayOf("walks")
    val breed = breedParam.uppercase(Locale.getDefault())

    init {
        println("The breed is $breed")
    }

    var weight = weightParam
        // 設定setter，value通常是setter的參數
        set(value) {
            // 使用field而不是weight可以避免無限迴圈
            if (value > 0) field = value
        }
    val weightInKgs: Double
        // 設定getter
        get() = weight / 2.2

    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}