public abstract class Plant implements IPlantCare {

    //Kapslar in instansvariabler med private/protected, tillgänliga genom setters&getters
    private final PlantType type;
    private String plantName;
    private double height;
    protected double liquidNeed;

    public Plant(String plantName, double height, PlantType type) {
        this.type = type;
        setPlantName(plantName);
        setHeight(height);
    }

    public PlantType getType() {
        return type;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height<0) throw new IllegalArgumentException("Ogiltig höjd!");
        this.height = height;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        if (plantName == null) throw new IllegalArgumentException("Ogiltigt namn!");
        this.plantName = plantName;
    }

    public String heightWithUnit(){
        return (getHeight() < 1) ? (getHeight()*100) + " cm " : getHeight() + " m ";
    }

    //Dessa metoder ger olika resultat beroende på subclass av Plant som skapats
    @Override
    public double getDailyLiquidNeed(){
        return this.liquidNeed;
    }

    @Override
    public String dailyLiquidNeedWithUnit(){
        return (getDailyLiquidNeed() < 1) ? (getDailyLiquidNeed()*100) + " cl " : getDailyLiquidNeed() + " liter ";
    }

    //Metod som skriver ut all info om plantan
    public String plantInfo(){
        return plantName + "\nPlanttyp: " + getType().type +
                "\nNuvarande höjd: " + heightWithUnit() +
                "\nVätskesort: " + getLiquidType().type +
                "\nVätska/dag: " + dailyLiquidNeedWithUnit();
    }

}
