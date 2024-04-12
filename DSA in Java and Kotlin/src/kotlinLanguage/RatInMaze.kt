package kotlinLanguage

import java.util.Stack

fun main() {
    
    val m = arrayOf(
        intArrayOf(1, 0, 0, 0),
        intArrayOf(1, 1, 0, 1),
        intArrayOf(1, 1, 0, 0),
        intArrayOf(0, 1, 1, 1)
    )

    val mazeRoute = findPath(m, m.size)

    println(mazeRoute)
    mazeRoute.forEach {
        print("$it ")
    }


}


fun findPath(m: Array<IntArray>, n: Int): Stack<String> {

    val result = Stack<String>()

    // first index value
    val srcX = 0
    val srcY = 0

    if (m[srcX][srcY] == 0) return result

    var path = Stack<String>()

    val visited = Stack<Stack<Boolean>>()

    val singleStack = Stack<Boolean>()

    for (i in 0..<n) singleStack.push(false)

    singleStack.forEach { _ -> visited.push(singleStack) }

    checkPath(m, n, srcX, srcY, path, visited, result)
    result.sorted()

    return result
}

fun checkPath(
    m: Array<IntArray>, n: Int, srcX: Int, srcY: Int, path: Stack<String>,
    visited: Stack<Stack<Boolean>>, result: Stack<String>
) {
    //todo; base case
    if (srcX == n - 1 && srcY == n - 1) {
        result.push(path.first())
        return
    }

    visited[srcX][srcY] = true

    //todo: ->  move the rat -> Down (x + 1, y)
    if (isSafe(m, n, srcX + 1, srcY, visited)) {
        path.push("D")
        checkPath(m, n, srcX + 1, srcY, path, visited, result)
        path.pop()
    }

    //todo: ->   move the rat -> Left (x, y - 1)
    if (isSafe(m, n, srcX, srcY - 1, visited)) {
        path.push("L")
        checkPath(m, n, srcX, srcY - 1, path, visited, result)
        path.pop()
    }

    //todo: ->   move the rat -> Right (x, y + 1)
    if (isSafe(m, n, srcX, srcY + 1, visited)) {
        path.push("R")
        checkPath(m, n, srcX, srcY + 1, path, visited, result)
        path.pop()
    }

    //todo: ->   move the rat -> Up (x - 1, y)
    if (isSafe(m, n, srcX - 1, srcY, visited)) {
        path.push("D")
        checkPath(m, n, srcX - 1, srcY, path, visited, result)
        path.pop()
    }

    visited[srcX][srcY] = false
}

fun isSafe(m: Array<IntArray>, n: Int, srcX: Int, srcY: Int, visited: Stack<Stack<Boolean>>): Boolean {
    //todo: =>  check that x & y points not out of bound
    if (srcX >= 0 && srcY >= 0 && srcX < n && srcY < n) {

        //todo: =>  main array index value is not zero means place not blocked for travel
        // visited check visited index is false that means you never come here before
        if (m[srcX][srcY] == 1 && !visited[srcX][srcY]) {
            return true
        }
    }


    return false
}
