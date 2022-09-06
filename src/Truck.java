public class Truck extends Bicycle {
    private String engineType;
    private String typeOfTrailer;

    public void check() {
        System.out.println("Обслуживаем: " + this.modelName + " меняем покрышки " + this.wheelsCount + " колес, " + "проверяем " + this.engineType + " двигатель, " + "проверяем "
                +this.typeOfTrailer + " прицеп." );
    }


    public Truck(String modelName, int wheelsCount, String engineType, String typeOfTrailer) {
        super(modelName, wheelsCount);
        this.engineType = engineType;
        this.typeOfTrailer = typeOfTrailer;
    }
}

