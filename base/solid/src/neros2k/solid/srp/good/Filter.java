package neros2k.solid.srp.good;
import neros2k.solid.srp.DataObject;
public class Filter {
    static String[] filtMessages(DataObject DATA_OBJECT) {
        return (String[]) DATA_OBJECT.getList().stream().filter((CONTENT) -> !CONTENT.equals("SPAM!!!")).toArray();
    }
}
