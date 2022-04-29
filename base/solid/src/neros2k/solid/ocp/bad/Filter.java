package neros2k.solid.ocp.bad;
import neros2k.solid.srp.DataObject;
public class Filter {
    Object[] filtMessages(DataObject DATA_OBJECT) {
        return DATA_OBJECT.getList().stream().filter((CONTENT) -> !CONTENT.equals("SPAM!!!")).toArray();
    }
    /* NEW PROBLEM FUNCTIONAL:
    static String[] filtMessages(DataObject DATA_OBJECT) {
        return (String[]) DATA_OBJECT.getList().stream().filter((CONTENT) -> !CONTENT.equals("SPAM!!!")).toArray();
    }
     */
}
