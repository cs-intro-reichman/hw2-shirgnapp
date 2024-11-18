// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	   int Number=Integer.parseInt(args[0]);
	   double denominator=3;
	   double fraction;
	   double pi= 1;
	   for(int i=0; i<Number-1; i++)
	   {
		if (i % 2 ==0) {
			fraction= (1/denominator);
			pi -= fraction;
		}
		else
		{
			fraction= (1/denominator);
			pi += fraction; 
		}
		denominator+=2;
	   }
	   pi*=4.0;
	   System.out.println("pi according to Java: " + Math.PI);
	   System.out.println("pi, approximated:     " + pi);
	}
}
