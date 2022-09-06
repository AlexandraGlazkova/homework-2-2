public class Bicycle {
    protected String modelName;
    protected int wheelsCount;

    public void check() {
        System.out.println("Обслуживаем: " + this.modelName + " меняем покрышки " + this.wheelsCount + " колес");
        }

    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
}
