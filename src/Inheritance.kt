fun main(){
var b=car("subaru","toyota","black",30)
    b.carry(8)
    println(b.calculateParkingFee(7))
    println()
    b.identity()
var d=Bus("nissan","prado","white",56)
   println( d.calculateParkingFee(6))
    d.maxiTripFare(4.123456)
}

class car( make:String, model:String,color:String,capacity:Int):Vehicle (make,model,color,capacity){

}

open class Vehicle(var make:String,var model:String,var color:String ,var capacity: Int){
 fun carry(people:Int) {
     var x= capacity - people
     if (people >= capacity) {
         println("carry $people passengers")

     } else {
         println("Over capacity by $people")
     }}
     fun identity() {
         println("I am a $make $model type")
     }

     open fun calculateParkingFee(hours: Int): Int {
         return hours * 20
     }
 }
class Bus(make:String,model:String,color:String,capacity:Int):Vehicle(make,model,color,capacity) {
    fun maxiTripFare(fare: Double): Double {
        var maxi = 0
        return 50 + fare
    }

   override fun calculateParkingFee(hours: Int): Int {
        return hours * capacity


    }

}

