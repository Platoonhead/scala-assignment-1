//task is to calculate the sum of product of number
class Logic{
//logic
  def processIt():Unit=
  {
    var num = 5 // number given here
    var a=0
    var sum=0
   var product=1
 
	for(iterator<- 1 to num ){
		
	product=product*iterator		
			
    }

    var num2 = product
    while(num2>0)
	{
		a=num2%10 //splitting the number
		sum=sum+a // adding it
		num2=num2/10
	}	
    println(s"product of  digits till number provided is $product")
    
    println(s"sum of digits of product is $sum")
  }
}


object Playwithdigits extends App{
val obj = new Logic
obj.processIt()// funcation invocation

}
