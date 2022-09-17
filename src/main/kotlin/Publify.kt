import io.javalin.Javalin
import io.javalin.http.staticfiles.Location

fun main(args: Array<String>) {
    val port = args.firstOrNull()?.toIntOrNull() ?: return println("Usage: java -jar publify.jar <port>")
    Javalin.create { cfg -> cfg.addStaticFiles(".", Location.EXTERNAL) }.start(port)
}