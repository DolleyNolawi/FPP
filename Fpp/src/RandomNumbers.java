import java.util.Random;

public class RandomNumbers {

    
    static Random random;
    
    private RandomNumbers() {
        random = new Random();
    }
    
    
    /** 
     *  Use this method to get a random integer, with a call like this:
     *     int myInt = RandomNumbers.getRandomInt();
     */
    public static int getRandomInt() {
        if(random == null) new RandomNumbers();
        return random.nextInt();
    }
    /**
     * Returns a random integer x satisfying
     * lower <= x <= upper. If lower > upper, returns 0.
     * @param lower
     * @param upper
     * @return
     */
    public static int getRandomInt(int lower, int upper) {
        if(lower > upper) return 0;
        if(lower == upper) return lower;
        int difference = upper - lower;
        int start = getRandomInt();
        
        //nonneg int in the range 0..difference - 1
        start = Math.abs(start) % (difference+1);
        
        start += lower;
        return start;
}
}
