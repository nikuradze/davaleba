import kotlin.math.sqrt
import kotlin.math.pow
fun main(){
    var sphere1 = Sphere(7.0)
    var cube1 = Cube(5.0)
    var cylinder1 = cylinder(4.0,8.0)
    println(sphere1.Volume())
    println(cylinder1.Volume())
    println(cube1.Volume())

    fun SumOfVolumes(x:Double = sphere1.Volume(),y:Double= cube1.Volume(),z:Double = cylinder1.Volume()): Double {
        return x + y + z
    }
    println(SumOfVolumes())


    var plane1 = Plane(1.0,3.0,5.0)
    var plane2 = Plane(2.0,3.0,5.0)
    println(plane1.Angle(plane2))
}


interface Ifigure3D{
    fun Volume():Double
    fun Area():Double

}


open class Sphere(var Radius:Double):Ifigure3D{
    override fun Volume(): Double {
        return (Radius.pow(3) * 4 * Math.PI)/3
    }

    override fun Area(): Double {
        return 4 * Radius.pow(2)*Math.PI
    }
}


open class cylinder(var Radius: Double, var height:Double):Ifigure3D{
    override fun Area(): Double {
        return 2 * Math.PI * Radius * height + 2 * Math.PI * Radius.pow(2)
    }

    override fun Volume(): Double {
        return Math.PI * Radius.pow(2) * height
    }
}
open class Cube (var edge:Double):Ifigure3D{
    override fun Area(): Double {
        return 6 * (edge.pow(2))

    }

    override fun Volume(): Double {
        return edge.pow(3)
    }
}
class Plane(var A:Double,var B:Double,var C:Double) {
    class normal constructor(var A: Double, var B: Double, var C: Double) {

    }

    fun Angle(ClassObject: Plane): Double {
        return (A * (ClassObject.A) + B * (ClassObject.B) + C * (ClassObject.C)) / (sqrt(A.pow(2) + B.pow(2) + C.pow(2)) * sqrt(
            ClassObject.A.pow(2) + ClassObject.B.pow(2) + ClassObject.C.pow(2)
        ))
    }


}