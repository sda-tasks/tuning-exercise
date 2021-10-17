package pl.sda;

public class ExtraTuning extends BasicTuning {

    public ExtraTuning(int enginePower, int torque, double mass) {
        super(enginePower, torque, mass);
    }

    @Override
    public void increaseEnginePower() {
        super.increaseEnginePower();
        setEnginePower(getEnginePower()*1.2);
    }

    @Override
    public void increaseTorque() {
        super.increaseTorque();
        setTorque(getTorque()*1.2);
    }

    @Override
    public void reduceMass() {
        super.reduceMass();
        setMass(getMass()*0.9);
    }

    @Override
    public String toString() {
        return "Extra" + super.toString();
    }
}
