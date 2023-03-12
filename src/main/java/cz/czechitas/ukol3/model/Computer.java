package cz.czechitas.ukol3.model;

public class Computer {
    private boolean isOn;
    private Processor cpu;
    private Memory ram;
    private Drive hardDrive;

        public Processor getCpu() {
        return cpu;
    }

    public void setCpu(Processor cpu) {
        this.cpu = cpu;
    }

    public Memory getRam() {
        return ram;
    }

    public void setRam(Memory ram) {
        this.ram = ram;
    }

    public Drive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(Drive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        if (cpu == null) {
            System.err.println("CPU is missing");
            return;
        } else if (ram == null) {
            System.err.println("RAM is missing");
            return;
        } else if (hardDrive == null) {
            System.err.println("Hard drive is missing");
            return;
        }
        isOn = true;
        System.out.println("The computer is on.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("The computer is off.");
    }

    public void createFile(long fileSize) {

        if ((Drive.usedSpace + fileSize) > Drive.capacity) {
            System.out.println("Not enough space on the hard drive.");
            return;
        }

       Drive.usedSpace + fileSize;

    }


    @Override
    public String toString() {
        return "Computer{" +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", hardDrive=" + hardDrive +
                '}';
    }
}
