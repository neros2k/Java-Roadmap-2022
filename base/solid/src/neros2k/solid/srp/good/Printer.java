package neros2k.solid.srp.good;
import neros2k.solid.srp.DataObject;
import java.util.Arrays;
public class Printer {
    static void printMessages(DataObject DATA_OBJECT) {
        System.out.println(Arrays.toString(Filter.filtMessages(DATA_OBJECT)));
    }
}
