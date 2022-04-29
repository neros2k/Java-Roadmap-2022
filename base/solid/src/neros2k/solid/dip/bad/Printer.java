package neros2k.solid.dip.bad;
import neros2k.solid.srp.DataObject;
import java.util.Arrays;
public class Printer {
    void printMessages(DataObject DATA_OBJECT) {
        Filter FILTER = new Filter();
        String[] RESULT = FILTER.filtMessages(DATA_OBJECT);
        System.out.println(Arrays.toString(RESULT));
    }
}
