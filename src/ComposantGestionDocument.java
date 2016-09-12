/**
 * Created by yassirhessane on 10/08/16.
 */
public class ComposantGestionDocument implements GestionDocument {

    @Override
    public String document(int index) {
        return "Document numéro "+ index;
    }
}
