public class Car extends Bicycle {
    private String engineType;

    public void check() {
        System.out.println("Обслуживаем: " + this.modelName + " меняем покрышки " + this.wheelsCount + " колес, " + "проверяем " + this.engineType + " двигатель");
    }


    public Car(String modelName, int wheelsCount, String engineType) {
        super(modelName, wheelsCount);
        this.engineType = engineType;
    }

}
