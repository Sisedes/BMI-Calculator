
import writedown
import Calculate

fun main(args: Array<String>) {
    print("Enter your name:"); var name:String= readln();
    print("Enter your age: "); var age:Int= readln().toInt();
    print("Whats your gender?(F/M):");var gender:String= readln();

    print("What is your weight?(KG)");var x:Double= readln().toDouble();
    while(x<0){
        println("Weight cannot be negative or zero!")
        x= readln().toDouble();
    }

    print("How tall are you?(CM)");var y:Double= readln().toDouble();
    while(y<0){
        println("Height cannot be negative or zero!")
        y= readln().toDouble();
    }
    y=y/100;
writedown(name,age,gender,x,y)

}