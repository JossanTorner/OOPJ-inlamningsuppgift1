public enum LiquidType {

    KRANVATTEN ("kranvatten"),
    PROTEINDRYCK ("proteindryck"),
    MINERALVATTEN ("mineralvatten");

    final String type;

    LiquidType(String t) {
        this.type = t;
    }
}
