object hello_scala02_control_worksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	var x = 1                                 //> x  : Int = 1
	
	// same with 'x > 0 ? 1 : -1' in Java/C
	if( x > 0) 1 else -1                      //> res0: Int = 1

	var s = if( x > 0 ) 1 else -1             //> s  : Int = 1

	if( x > 0 ) s = 1 else s = -1

	// In scala, every expression has a type
	// 'if( x > 0) 1 else -1 ' has integer type

	// the following has 'ANY' type
	if( x > 0) "positive" else -1             //> res1: Any = positive

	// the following is equivalent to 'if( x > 0 ) 1 else ()'
	if( x > 0 ) 1                             //> res2: AnyVal = 1

	// the following expression has 'Unit' as type.
	// 'Unit' is similar with 'void'
	if( x == 0 ) 1                            //> res3: AnyVal = ()

	if( x > 0 ) { 1 } else { -1 }             //> res4: Int = 1

	// the follwing expression has the value of last expression 'x+2'
	if( x > 0 ) { 1 ; x + 1 ; x + 2 } else { -1 }
                                                  //> res5: Int = 3
	// the follwings are regarded as expression. (not statement list)
	if( x > 0 )
	{
		1 ;
		x + 1 ;
		x + 2
	}
	else
	{ -1 ; }                                  //> res6: Int = 3

	// if expression will be reduced to Variable
	var c = if( x > 0 )
		{
			x + 1;
			x + 2;
			x + 3;
		}
		else
		{
			x - 1 ;
			x - 2 ;
		}                                 //> c  : Int = 4

	println("c="+c)                           //> c=4

	// if expression code parts can be referenced by using 'def'(..?)
	def f = if( x > 0 )
		{
			x + 1;
			x + 2;
			x + 3;
		}
		else
		{
			x - 1 ;
			x - 2 ;
		}                                 //> f: => Int

	
		/**
		 * Line Termination
		 */
		 
	val st_1 = 1 + 2 + 3                      //> st_1  : Int = 6

	// continued line
	val st_2 = 1 + 2 +
			3                         //> st_2  : Int = 6

	// seperated line
	val st_3 = 1 + 2                          //> st_3  : Int = 3
			+ 3                       //> res7: Int = 3

	var r = 0;                                //> r  : Int = 0
	var n = 1;                                //> n  : Int = 1
	
	// the following has an reduced expression type 'Unit'
	// Assignment has 'Unit' expression type
	{ r = r * n }

	// 'asgn_y = 1' has 'Unit' type. so the result cannot be allocated to 'asgn_x'
	// If Java or C 'asgn_y =1' has 'Integer value', and it can be allocated to 'asgn_x'
	// asgn_x = asgn_y = 1 // scala does not permit this expression

	 
	// next is 2.4 Input and Output

}