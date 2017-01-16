//aim is to calculate nth fibonacci number using recursion
class Logic{
//function to calculate the nth fibonacci 
  def calculate(n:Int,a1:Int,b1:Int,c1:Int):Unit={
     
     var first=a1  // 1st fibonacci number in series
     var second=b1   // 2nd fibonacci number in series
     var next=c1   // variable to hold next fibonacci in series 
     var local=n
      next = first+second
      first=second
      second=next
      local=local-1
     if(local>0)
     calculate(local,first,second,next)
     if(n==1)
     {
     println(s"fibonacci number is $first")
     }
  }
}

object Fibonacci extends App{
val obj = new Logic
obj.calculate(5,0,1,0)   //function invocation to calculate the 3rd fibonacci 

}
