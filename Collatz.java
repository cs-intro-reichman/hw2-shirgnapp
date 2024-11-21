// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]);
		String SecondInput = args[1];
		char a = SecondInput.charAt(0);
        int ReferenceNumber = 1, count = 2;
        int j = 4;
        if ( a== 'v' || a== 'V' ) {
            System.out.print("1 4 ");
          for( int i=1; i<=N; i++)
            {
                if (i!=1) {
                    System.out.print(j+ " ");
                    count++;
                }
                while (j!=1) {
                    if (j%2 == 0) {
                        j = j/2; 
                        System.out.print(j+ " ");
                        count++;
                    }
                    else
                    {
                        j *= 3;
                        j++;
                        System.out.print(j+ " ");;
                        count++;
                    }
                }
                ReferenceNumber++;
                j = ReferenceNumber;
                System.out.print("("+ count + ")");
                System.out.println();
                count = 0;
             }
    }
    if (a== 'c' || a== 'C') {
        for(int i=1; i<=N; i++)
          {
              while (j!=1) {
                  if (j%2==0) {
                      j = j/2; 
                  }
                  else
                  {
                      j *= 3;
                      j++;
                     
                  }
              }
              ReferenceNumber++;
              j = ReferenceNumber;
              count = 0;
           }
  }
    System.out.println("Every one of the first "+ N + " hailstone sequences reached 1.");
    }
}

		


