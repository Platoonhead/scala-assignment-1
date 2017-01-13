// determining string interpolation
class Logic{
//function to perform string interepolation logic
  def interpole():Unit=
  {
    var counter = 0
    val series= List(10,20,30,40,50)
 
	for(l<-series){
        println(s"$counter=$l") // string interpolation going in here
        counter = counter+1}
  }
}


object Inter extends App{

val obj = new Logic 
obj.interpole() // funcation invocation

}
