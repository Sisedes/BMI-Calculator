
    fun Calculate(weight:Double,length:Double){
        var sum:Double=weight/(length*length)

        if(sum<=18.5){
            println("Your underweight")
        }else if(24.9>=sum&&sum>=18.5)
        {println("Your normal weight")}
        else if(29.9>=sum&&sum>=25)
            println("Your overweight")
        else if(39.9>=sum&&sum>=30)
            println("Your obese")
        else if(sum>=40)
            println("Your morbid obese")


    }
    fun writedown(na:String,ag:Int,gende:String,kg:Double,hei:Double){
        println("Name: "+na);
        println("Age: "+ag);
        println("Gender: "+gende);
        println("Weight: "+kg+"kg");
        println("Height:"+hei*100+"cm");
        Calculate(kg,hei);


    }
