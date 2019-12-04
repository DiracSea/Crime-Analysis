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
        String input = args[0], output = args[1], pType = args[2]; 
        System.out.println(pType == "0"); 
        wordCount w = new wordCount();
        // ward
        w.count(input, pType, Type.ward, output+"/ward");
        w.count(input, pType, Type.block, output+"/block");
        w.count(input, pType, Type.district, output+"/district");
        w.count(input, pType, Type.location, output+"/location");
        w.count(input, pType, Type.community, output+"/community");
        w.count(input, pType, Type.month, output+"/month");
        w.count(input, pType, Type.day, output+"/day"); 
        w.count(input, pType, Type.hour, output+"/hour"); 
        w.count(input, pType, Type.monthday, output+"/monthday"); 
    }
}
