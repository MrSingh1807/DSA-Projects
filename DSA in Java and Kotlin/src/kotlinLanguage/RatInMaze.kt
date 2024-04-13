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

    println("Maze Size  ${mazeRoute.size}")
    mazeRoute.forEach {
        print("$it -> ")
    }
}


fun findPath(m: Array<IntArray>, n: Int): Stack<String> {

    val result = Stack<String>()

    // first index value
    val srcX = 0
    val srcY = 0

    if (m[srcX][srcY] == 0) return result

    val path = Stack<String>()
    val visited = arrayListOf(
        arrayListOf(false, false, false, false),
        arrayListOf(false, false, false, false),
        arrayListOf(false, false, false, false),
        arrayListOf(false, false, false, false),
    )

    visited.forEach {
        it.forEach { print("$it ") }
        println()
    }
    println()

    checkPath(m, n, srcX, srcY, path, visited, result)
    result.sorted()

    println()
    visited.forEach {
        it.forEach { print("$it ") }
        println()
    }

    return result
}

fun checkPath(
    m: Array<IntArray>, n: Int, srcX: Int, srcY: Int, path: Stack<String>,
    visited: ArrayList<ArrayList<Boolean>>, result: Stack<String>
) {
    //todo: base case
    if (srcX == n - 1 && srcY == n - 1) {
        path.forEach { print(" $it ==>") }
        visited.forEach { it.fill(true) }
        result.addAll(path)
        return
    }

    visited[srcX][srcY] = true
    print("result - ")
    result.forEach { print("$it ") }
    println()
    println("Sorce ($srcX , $srcY )")
    println()

    //todo: ->  move the rat -> Down (x + 1, y)
    if (isSafe(m, n, srcX + 1, srcY, visited)) {
        println("Move - D")
        path.push("D")
        checkPath(m, n, srcX + 1, srcY, path, visited, result)
        path.clear()
    }

    //todo: ->   move the rat -> Left (x, y - 1)
    if (isSafe(m, n, srcX, srcY - 1, visited)) {
        println("Move - L")
        path.push("L")
        checkPath(m, n, srcX, srcY - 1, path, visited, result)
        path.clear()
    }

    //todo: ->   move the rat -> Right (x, y + 1)
    if (isSafe(m, n, srcX, srcY + 1, visited)) {
        println("Move - R")
        path.push("R")
        checkPath(m, n, srcX, srcY + 1, path, visited, result)
        path.clear()
    }

    //todo: ->   move the rat -> Up (x - 1, y)
    if (isSafe(m, n, srcX - 1, srcY, visited)) {
        println("Move - U")
        path.push("U")
        checkPath(m, n, srcX - 1, srcY, path, visited, result)
        path.clear()
    }

    result.forEach { print("  Result Bottom -->  $it") }
    println()
    visited[srcX][srcY] = false
}

fun isSafe(m: Array<IntArray>, n: Int, srcX: Int, srcY: Int, visited: ArrayList<ArrayList<Boolean>>): Boolean {
    //todo: =>  check that x & y points not out of bound
    println("Inside IsSafe : Sorce  ($srcX , $srcY)")
    if (srcX >= 0 && srcY >= 0 && srcX < n && srcY < n) {

        //todo: =>  main array index value is not zero means place not blocked for travel
        // visited check visited index is false that means you never come here before
        println("Inside IsSafe : mIndex = ${m[srcX][srcY]} & isVisited = ${visited[srcX][srcY]}")

        if (m[srcX][srcY] == 1 && !visited[srcX][srcY]) {
            return true
        }
    }

    println()
    return false
}
