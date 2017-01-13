//figure out largest element in the list
class Logic{
//logic to calculate maximum number in List 
  def max():Unit=
  {
    var ismax = 0
    val series= List(10,20,30,40,50) // List
 
	for(l<-series){

		if(l > ismax){
		
		  ismax=l // updating maxmimum value

                }
    }

    println(s"largest number is $ismax") 
  }
}


object Largest extends App{
val obj = new Logic
obj.max() // funcation invocation

}
