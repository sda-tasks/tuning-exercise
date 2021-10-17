package pl.sda;

public class WorkShop {

    public static void main(String[] args) {
        BasicTuning basicTuning = new BasicTuning(141, 300, 1220);
        basicTuning.increaseEnginePower();
        basicTuning.increaseTorque();
        basicTuning.reduceMass();

        System.out.println(basicTuning);

        System.out.println("******************");

        BasicTuning extraTuning = new ExtraTuning(141, 300, 1220);
        extraTuning.increaseEnginePower();
        extraTuning.increaseTorque();
        extraTuning.reduceMass();

        System.out.println(extraTuning);
    }
}
