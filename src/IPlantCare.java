public interface IPlantCare {

    //Interface som berör vätskebehov för plantor

    LiquidType getLiquidType();

    void calculateDailyLiquidNeed();

    double getDailyLiquidNeed();

    String dailyLiquidNeedWithUnit();

}
