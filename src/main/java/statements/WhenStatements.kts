/**
 * WHEN STATEMENT.
 */

val x = 'a'

when (x) {
    'a' -> print("x = a")
    'b' -> print("x = b")
    else -> {
        print("x is neither a nor b")
    }
}

print("\n")

val n = 4

when(n) {
    1,2,3 -> print("x is 1, 2 or 3")
    else -> {
        print("otherwise")
    }
}

