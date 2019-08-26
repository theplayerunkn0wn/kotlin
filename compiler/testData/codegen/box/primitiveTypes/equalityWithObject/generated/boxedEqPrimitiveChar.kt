// IGNORE_BACKEND: WASM
// Auto-generated by GeneratePrimitiveVsObjectEqualityTestData. Do not edit!

val nx: Char? = '0'
val nn: Char? = null
val x: Char = '0'
val y: Char = '1'

fun box(): String {
    val ax: Char? = '0'
    val an: Char? = null
    val bx: Char = '0'
    val by: Char = '1'

    return when {
        nx != '0' -> "Fail 0"
        nx == '1' -> "Fail 1"
        !(nx == '0') -> "Fail 2"
        !(nx != '1') -> "Fail 3"
        nx != x -> "Fail 4"
        nx == y -> "Fail 5"
        !(nx == x) -> "Fail 6"
        !(nx != y) -> "Fail 7"
        nn == '0' -> "Fail 8"
        !(nn != '0') -> "Fail 9"
        nn == x -> "Fail 10"
        !(nn != x) -> "Fail 11"
        ax != '0' -> "Fail 12"
        ax == '1' -> "Fail 13"
        !(ax == '0') -> "Fail 14"
        !(ax != '1') -> "Fail 15"
        ax != x -> "Fail 16"
        ax == y -> "Fail 17"
        !(ax == x) -> "Fail 18"
        !(ax != y) -> "Fail 19"
        ax != bx -> "Fail 20"
        ax == by -> "Fail 21"
        !(ax == bx) -> "Fail 22"
        !(ax != by) -> "Fail 23"
        an == '0' -> "Fail 24"
        !(an != '0') -> "Fail 25"
        an == x -> "Fail 26"
        !(an != x) -> "Fail 27"
        an == bx -> "Fail 28"
        !(an != bx) -> "Fail 29"
        else -> "OK"
    }
}
