package pre_process;
import pre_process.wordCount.*;

public class execute {
    public static void main(String args[]) {
        /*
        * 0: input
        * 1: primary ptype
        * 2: output ward
        * 3: output block
        * 4: output district
        * 5: output time month
        * 6: output time day
        * 7: output location
        * 8: output community
        * */
        // ward, location, block, district, month, day, community
        String input = args[0], pType = args[1];

        wordCount w = new wordCount();
        // ward
        w.count(input, pType, Type.ward, args[2]);
        w.count(input, pType, Type.block, args[3]);
        w.count(input, pType, Type.district, args[4]);
        w.count(input, pType, Type.month, args[5]);
        w.count(input, pType, Type.day, args[6]);
        w.count(input, pType, Type.location, args[7]);
        w.count(input, pType, Type.community, args[8]);
    }
}
