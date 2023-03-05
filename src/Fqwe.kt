



class Fqwe {

    fun f1(){
        try {
           println("Введите первое целое число")
            var z = readLine()!!.toInt()
            println("Введите второе целое число")
            var x = readLine()!!.toInt()
            if (z%2==0&& x%2==0)
            {
                println("числа чётные")
            }
            else if(z%2 !=0 && x%2!=0)
            {
                println("числа не чётные")
            }
            else if(z%2 ==0 && x%2!=0)
            {
                println("первое число чётное, а второе нет")
            }
            else if(z%2 !=0 && x%2==0)
            {
                println("второе число чётное, а первое нет")
            }



        }
        catch (e:Exception)
        {

        }


    }
    fun f2(){

        println("Введите сторону квадрата")
        var storona = readLine()!!.toDouble()
        storona = storona*storona
        println("Площадь квадрата=$storona")
    }

}