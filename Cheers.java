// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        String cheers=args[0];
        cheers=cheers.toUpperCase();
        int times= Integer.parseInt(args[1]);
        int leneth=cheers.length();
        char a;
        int i = 0;
        while (i<leneth) {
                a= cheers.charAt(i);
                if(a=='A' || a=='E' || a== 'F' || a== 'H' || a== 'I' || a== 'L' || a== 'M' || a== 'N' || a== 'O' || a== 'R' ||  a== 'S' || a=='X')
                {
                        System.out.println("Give me an " + a + ": " + a + "!");

                }
                else
                System.out.println("Give me a " + a + ": " + a + "!");
                i++;
        }
        System.out.println("What does that spell?");
        for(int j =0; j < times; j++)
        {
                System.out.println(cheers + "!!!");
        }
        
        
               
        

}
}
