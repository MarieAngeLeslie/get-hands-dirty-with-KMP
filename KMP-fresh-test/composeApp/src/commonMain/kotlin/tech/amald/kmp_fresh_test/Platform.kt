package tech.amald.kmp_fresh_test

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform