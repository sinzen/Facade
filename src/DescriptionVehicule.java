/**
 * Created by yassirhessane on 10/08/16.
 */
public class DescriptionVehicule {

    protected String description;
    protected int prix;

    public DescriptionVehicule(String description, int prix) {
        this.description = description;
        this.prix = prix;
    }

    public String getDescription()
    {
        return this.description;
    }

    public int getPrix(){
        return this.prix;
    }

}
