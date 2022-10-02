public class Challenge {
    public static void main(String[] args){
        byte byteValue = 120;
        short shortValue = 1776;
        int intValue = 326_785;
        long longValue = 50000L + 10L*(long)(byteValue + shortValue + intValue);

        System.out.println(longValue);
    }
}
