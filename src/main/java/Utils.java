import org.apache.log4j.Logger;

public class Utils {
private static final int MINUS_ONE = -1;
    //visszaadja a legnagyobb elem indexét
    //üres tömb vagy null esetén -1
    private static final Logger logger = Logger.getLogger(Utils.class);

    public static int maxker(int[] array){
        if(array == null)
            return MINUS_ONE;
        int idx = MINUS_ONE;
        int max = Integer.MIN_VALUE;
        logger.info("Search is starting...");
        for(int i=0; i<array.length; i++){
            if (array[i] >= max){
                idx = i;
                max = array[i];
            }
        }
        return idx;
    }

    public static void main(String[] args){

        maxker( new int[] {1,2,3});
    }

}


