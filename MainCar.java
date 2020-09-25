public class MainCar {
    public static void main(String[] args) {

        Lorry lorrry = new Lorry("Шкода") {
            @Override
            void start() {
                super.start();
            }
        };
    }
  }


