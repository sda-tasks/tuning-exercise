package pl.sda;

public class BasicTuning {
    private double enginePower;
    private double torque;
    private double mass;

    public BasicTuning(double enginePower, double torque, double mass) {
        this.enginePower = enginePower;
        this.torque = torque;
        this.mass = mass;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getTorque() {
        return torque;
    }

    public double getMass() {
        return mass;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void increaseEnginePower() {
        setEnginePower(getEnginePower() + 10);
    }

    public void increaseTorque() {
        setTorque(getTorque() + 30);
    }

    public void reduceMass() {
        setMass(getMass() - 10);
    }

    @Override
    public String toString() {
        return "Tuning{" +
                "enginePower=" + enginePower +
                ", torque=" + torque +
                ", mass=" + mass +
                '}';
    }
}
