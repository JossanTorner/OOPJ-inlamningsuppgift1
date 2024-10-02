import javax.swing.*;

public class Main {

    PlantHotel greenest;

    //Polymorfism: får olika svar på metodanrop beroende på vilken instans av Plant som skrivs ut
    public void displayPlantInfo(String plantName){
        Plant plant = greenest.plantFound(plantName);
        if(plant != null){
            JOptionPane.showMessageDialog(null,
                    plant.plantInfo());
        }
        else{
            JOptionPane.showMessageDialog(null,
                    "Plantan är inte incheckad på hotellet!");
        }
    }

    public void plantNamePrompt(){
        while(true){
            String plantName = JOptionPane.showInputDialog("Vilken växt ska få vätska?");
            if (plantName == null){
                break;
            }
            displayPlantInfo(plantName);
        }
    }

    Main(){

        //Skapar upp ett hotell och checkar in gäster
        greenest = new PlantHotel();
        try{
            greenest.checkInPlant(new Cactus("Igge", 0.2));
            greenest.checkInPlant(new PalmTree("Laura", 5));
            greenest.checkInPlant(new CarnivorousPlant("Meatloaf", 0.7));
            greenest.checkInPlant(new PalmTree("Olof", 1));

        }
        catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        plantNamePrompt();
    }

    public static void main(String[] args) {

        Main main = new Main();

    }
}
