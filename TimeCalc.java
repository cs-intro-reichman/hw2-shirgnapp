public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        int totalhour, totalminutes, NewHours, NewMinuets;
        totalminutes = (hours * 60) + minutes + minutesToAdd; 
        totalhour = (totalminutes / 60);
        NewHours = totalhour % 24; 
        NewMinuets = totalminutes - (totalhour * 60);
        if (NewHours < 10) {
            if (NewMinuets < 10) {
            System.out.println("0"+ NewHours + ":0" + NewMinuets);
            }
            else
            System.out.println("0"+ NewHours + ":" + NewMinuets);
        }
        else
        {
            if (NewMinuets < 10) {
                System.out.println(NewHours + ":0" + NewMinuets);
                }
                else
                System.out.println(NewHours + ":" + NewMinuets);   
        }
       
    }
}

