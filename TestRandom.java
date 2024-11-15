// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
	    int times= Integer.parseInt(args[0]);
		int i=1, countSmall=0, countBig=0;
		double random=0, ratio=0;
		while (i<=times) {
			random= Math.random();
			ratio+=random;
			if (random<0.5) {
				countSmall++;
			}
			else
			countBig++;
			i++;
		}
		ratio/=times;
		System.out.println("> 0.5 :" + countBig);
		System.out.println("< 0.5: " + countSmall);
		System.out.println( " Ratio: " + ratio);


	}
}
