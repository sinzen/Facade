import java.util.ArrayList;

/**
 * Created by yassirhessane on 10/08/16.
 */
public class WebServiceAutoImpl implements WebServiceAuto {

    protected Catalogue catalogue;
    protected GestionDocument gestionDocument;

    public WebServiceAutoImpl() {
        this.catalogue = new ComposantCatalogue();
        this.gestionDocument = new ComposantGestionDocument();
    }

    @Override
    public String document(int index) {
        return this.gestionDocument.document(index);
    }

    @Override
    public ArrayList<String> chercheVehicules(int prixMoyen, int ecartMax) {
        return this.catalogue.retrouveVehicule(prixMoyen - ecartMax,prixMoyen + ecartMax);
    }
}
