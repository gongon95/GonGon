object hello_scala01_var_worksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	/**
	  * Varialbe
    **/
    
	/* invariant variable - use 'val' */
	val v1 = 8 * 5 + 2                        //> v1  : Int = 42
		//	v1 = 20 // error
	val v2 = 0.5 * v1                         //> v2  : Double = 21.0
	val v3 = "Hello, " + v2   // Java String  //> v3  : String = Hello, 21.0
	val v4 = v3.indexOf("lo")                 //> v4  : Int = 3
	val v5 = v3.toUpperCase()                 //> v5  : String = HELLO, 21.0

	/* variant variable - use 'var' */
	var var1 = 8 * 5 + 2                      //> var1  : Int = 42
			var1 = 10
			println(var1)             //> 10
 
	/* typed varialbe */
	val tval_1 : String = "Hello World"       //> tval_1  : String = Hello World
	val tval2 : String = null                 //> tval2  : String = null

	/* any type variable */
	val tval3 : Any		 = "Hello"        //> tval3  : Any = Hello

	/* defining multiple variable */
	val xmax, ymax = 100                      //> xmax  : Int = 100
                                                  //| ymax  : Int = 100

	/**
	 * Integer Type
	 **/
	1.toString()                              //> res0: String = 1
	/* member method for returning 'collecion' */
	1.to(10)                                  //> res1: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 7
                                                  //| , 8, 9, 10)
	/* the following is the same expression with above member method */
	1 to 10                                   //> res2: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 7
                                                  //| , 8, 9, 10)
	/* You can use the following expression */
	'a'.to('z')                               //> res3: scala.collection.immutable.NumericRange.Inclusive[Char] = NumericRange
                                                  //| (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, 
                                                  //| z)
  /* Same with above expression */
	'a' to 'z'                                //> res4: scala.collection.immutable.NumericRange.Inclusive[Char] = NumericRange
                                                  //| (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, 
                                                  //| z)

	/* '+' is a member method of integer '1' */
	/* In general a.method(b) = a method b */
	1 + 2                                     //> res5: Int(3) = 3
	1.+(2)                                    //> res6: Int(3) = 3

	var a = 1                                 //> a  : Int = 1
	a += 1
	a                                         //> res7: Int = 2
	/* scala does not support '++', '--' operator */
	//a ++

	/* Big Integer */
	val x_1: BigInt = 124567890               //> x_1  : BigInt = 124567890
	x_1 * x_1 * x_1                           //> res8: scala.math.BigInt = 1932939782711367897069000

	val x_2 = 124567890                       //> x_2  : Int = 124567890
	x_2 * x_2 * x_2                           //> res9: Int = -1334430264

	import scala.math._

	sqrt(2)                                   //> res10: Double = 1.4142135623730951
	pow(2,4)                                  //> res11: Double = 16.0
	min(3, Pi)                                //> res12: Double = 3.0
	
	/**
	 * apply() method
	 */
	
	// the following can be thought as overloading from '()' operator
	"Hello"(4)                                //> res13: Char = o
	"Hello".apply(4)                          //> res14: Char = o
	"hello" apply 4                           //> res15: Char = o
	

}