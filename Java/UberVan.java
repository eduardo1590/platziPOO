import java.util.Map;
import java.util.ArrayList;

public class UberVan extends Car{
    
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(String license, Account driver){
        super(license, driver); 
    }
    
    public UberVan(String license, Account driver, 
                    Map<String, Map<String,Integer>> typeCarAccepted, 
                    ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    @Override
    public void setPassenger(Integer passenger) {
        if (passenger == 6){
            this.passenger = passenger;
        }else{
            System.out.println("Debes tener capacidad de 6 pasajeros");
        }
    }

}
