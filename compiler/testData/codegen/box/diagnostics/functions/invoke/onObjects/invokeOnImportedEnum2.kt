// IGNORE_BACKEND: WASM
import A.ONE

enum class A {
    ONE,
    TWO
}

operator fun A.invoke(i: Int) = i

fun box() = if (ONE(42) == 42) "OK" else "fail"
