package neros2k.solid.ocp.good;
import neros2k.solid.srp.DataObject;
public class StringCastFilter extends Filter {
    @Override
    String[] filtMessages(DataObject DATA_OBJECT) {
        return (String[]) super.filtMessages(DATA_OBJECT);
    }
}
