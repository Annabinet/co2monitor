object Libs {
    const val kotlinVersion = "1.3.60"

    private const val ktorVersion = "1.3.0-beta-1"
    private const val moshiVersion = "1.8.0"

    val ktorServerCore = "io.ktor:ktor-server-core:$ktorVersion"
    val ktorNetty = "io.ktor:ktor-server-netty:$ktorVersion"

    val moshi = "com.squareup.moshi:moshi:$moshiVersion"
    val moshiCodegen = "com.squareup.moshi:moshi-kotlin-codegen:$moshiVersion"

    val graphQlJava = "com.graphql-java:graphql-java:13.0"
    val loggerSimple = "org.slf4j:slf4j-simple:1.7.29"

    const val sqldelightVersion = "1.4.0"
    const val sqldelightPlugin = "com.squareup.sqldelight"
    val sqliteDriver = "com.squareup.sqldelight:sqlite-driver:$sqldelightVersion"

    const val shadowJarPlugin = "com.github.johnrengelman.shadow"
    const val shadowJarPluginVersion = "6.0.0"
}
