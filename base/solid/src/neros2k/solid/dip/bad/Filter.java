package neros2k.solid.dip.bad;
import neros2k.solid.srp.DataObject;
public class Filter {
    String[] filtMessages(DataObject DATA_OBJECT) {
        return (String[]) DATA_OBJECT.getList().stream().filter((CONTENT) -> !CONTENT.equals("SPAM!!!")).toArray();
    }
}
