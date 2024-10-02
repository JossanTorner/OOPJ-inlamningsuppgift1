public class CarnivorousPlant extends Plant {

    double baseLiquidLiters = 0.1;
    double liquidTimesHeightLiters = 0.2;

    public CarnivorousPlant(String plantName, double height){
        super(plantName, height, PlantType.KÖTTÄTARE);
        calculateDailyLiquidNeed(); //Beräknar vätskebehov när objekt initieras
    }

    //Metod som returnerar vilken vätsketyp som tillhör klassen
    @Override
    public LiquidType getLiquidType(){
        return LiquidType.PROTEINDRYCK;
    }

    @Override
    public void calculateDailyLiquidNeed(){
        this.liquidNeed = baseLiquidLiters + (liquidTimesHeightLiters * this.getHeight());
    }
}
