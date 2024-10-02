public class PalmTree extends Plant {

    double liquidTimesHeightLiters = 0.5;

    public PalmTree(String plantName, double height){
        super(plantName, height, PlantType.PALM);
        calculateDailyLiquidNeed(); //Beräknar vätskebehov när objekt initieras
    }

    //Metod som returnerar vilken vätsketyp som tillhör klassen
    @Override
    public LiquidType getLiquidType(){
        return LiquidType.KRANVATTEN;
    }

    @Override
    public void calculateDailyLiquidNeed(){
        this.liquidNeed = liquidTimesHeightLiters * this.getHeight();
    }


}
