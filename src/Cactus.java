public class Cactus extends Plant {

    double baseLiquidLiters = 0.02;

    public Cactus(String plantName, double height) {
        super(plantName, height, PlantType.KAKTUS);
        calculateDailyLiquidNeed(); //Beräknar vätskebehov när objekt initieras
    }

    //Metod som returnerar vilken vätsketyp som tillhör klassen
    @Override
    public LiquidType getLiquidType(){
        return LiquidType.MINERALVATTEN;
    }

    @Override
    public void calculateDailyLiquidNeed(){
        this.liquidNeed = baseLiquidLiters;
    }

}
