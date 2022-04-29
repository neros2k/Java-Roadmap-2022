package neros2k.solid.dip.good;
import neros2k.solid.srp.DataObject;
public class Filter implements ICanFilt {
    @Override
    public String[] filtMessages(DataObject DATA_OBJECT) {
        return (String[]) DATA_OBJECT.getList().stream().filter((CONTENT) -> !CONTENT.equals("SPAM!!!")).toArray();
    }
}
