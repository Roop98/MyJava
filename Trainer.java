package ee.sdacademy;


class Trainer {
    String[] name = {"Running", "Stretching", "Weight lifting", "Push-ups", "Crunches"};
    float[] stamina = {23.4f, 12.5f, 54.3f, 33.2f, 26.78f};
    float[] strength = {10, 20, 15, 34, 29};
}

class Trainee {
    String[] name1 = {"Running", "Stretching", "Weight lifting", "Push-ups", "Crunches"};
    float[] stamina1 = {9.3f, 8.56f, 34.55f, 12.34f, 18.85f};
    float[] strength1 = {5, 10, 15, 23, 19};
}

class Add {
    Trainer trainer = new Trainer();
    Trainee trainee = new Trainee();

    protected void name() {

        for (int i = 0; i < trainer.name.length; i++) {
            System.out.println("Name of the exercise is: " + trainer.name[i]);
            System.out.println("Stamina of the exercise is: " + trainer.stamina[i]);
            System.out.println("Strength of the exercise is: " + trainer.strength[i]);
        }
    }

    protected void name1() {

        for (int i = 0; i < trainer.name.length; i++) {
            System.out.println("Name of the exercise is: " + trainee.name1[i]);
            System.out.println("Stamina of the exercise is: " + trainee.stamina1[i]);
            System.out.println("Strength of the exercise is: " + trainee.strength1[i]);
        }
    }
}

class yes {
    public static void main(String[] args) {
        Add add = new Add();
        add.name();
    }
}
