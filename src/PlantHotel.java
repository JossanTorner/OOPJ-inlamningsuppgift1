import java.util.ArrayList;
import java.util.List;

public class PlantHotel { //Klassen representerar hotellet och håller en lista med hotellgäster

    private List<Plant> hotelGuests;

    public PlantHotel(){
        hotelGuests = new ArrayList<Plant>();
    }

    public List<Plant> getHotelGuests() {
        return hotelGuests;
    }

    public void setHotelGuests(List<Plant> hotelGuests) {
        this.hotelGuests = hotelGuests;
    }

    public void checkInPlant(Plant plant){
        hotelGuests.add(plant);
    }

    public void checkOutPlant(Plant plant){
        hotelGuests.remove(plant);
    }

    public Plant plantFound(String plantName){ //Metod som kollar om det finns en gäst med givet namn
        for (Plant p: getHotelGuests()){
            if(p.getPlantName().equalsIgnoreCase(plantName)){
                return p;
            }
        }
        return null;
    }
}
