package neros2k.solid.ocp.good;
import neros2k.solid.srp.DataObject;
public class Filter {
    Object[] filtMessages(DataObject DATA_OBJECT) {
        return DATA_OBJECT.getList().stream().filter((CONTENT) -> !CONTENT.equals("SPAM!!!")).toArray();
    }
}
