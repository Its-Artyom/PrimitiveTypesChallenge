public class Challenge {
    public static void main(String[] args){
        byte variable1 = 120;
        short variable2 = 1776;
        int variable3 = 326_785;
        long variable4 = 50000L + 10L*(long)(variable1 + variable2 + variable3);

        System.out.println(variable4);
    }
}
