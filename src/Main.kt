import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking



suspend fun main()
{
    var f = Fqwe()

    println("Сколько раз вы хотите вызвать функцию")
    var a = readLine()!!.toInt()
    a = a-1
    for (i in 0..a)
    {
        GlobalScope.launch {
            delay(7000L)
            print(f.f2())
        }
        println(f.f1())

        runBlocking {
            delay(5000L)
        }
    }
}