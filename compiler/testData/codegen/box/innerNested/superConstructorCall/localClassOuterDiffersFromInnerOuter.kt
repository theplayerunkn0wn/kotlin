// IGNORE_BACKEND: WASM
class A {
    fun bar(): Any {
        return {
            {
                class Local : Inner() {
                    override fun toString() = foo()
                }
                Local()
            }()
        }()
    }

    open inner class Inner
    fun foo() = "OK"
}

fun box(): String = A().bar().toString()
