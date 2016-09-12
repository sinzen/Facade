import java.util.ArrayList;

/**
 * Created by yassirhessane on 10/08/16.
 */
public class ComposantCatalogue implements Catalogue {

    protected ArrayList<DescriptionVehicule> descriptionsVehicule = new ArrayList<>();

    public ComposantCatalogue() {
        this.descriptionsVehicule.add(new DescriptionVehicule("Berline 5 portes",6000));
        this.descriptionsVehicule.add(new DescriptionVehicule("Compact 3 portes",4000));
        this.descriptionsVehicule.add(new DescriptionVehicule("Espace 5 portes",8000));
        this.descriptionsVehicule.add(new DescriptionVehicule("Break 5 portes",7000));
        this.descriptionsVehicule.add(new DescriptionVehicule("Coupe 2 portes",9000));
        this.descriptionsVehicule.add(new DescriptionVehicule("Utilitaire 3 portes",5000));
    }

    @Override
    public ArrayList<String> retrouveVehicule(int prixMin, int prixMax) {
        ArrayList<String> resultat = new ArrayList<>();
        for (DescriptionVehicule descriptionVehicule:this.descriptionsVehicule)
        {
            int prix = descriptionVehicule.getPrix();
            if((prix >= prixMin) && (prix <=prixMax))
            {
                resultat.add(descriptionVehicule.getDescription());
            }
        }
        return resultat;

    }
}
