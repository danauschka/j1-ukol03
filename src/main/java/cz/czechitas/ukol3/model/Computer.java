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
        if (isOn) {
            System.out.println("Problem found: The computer is already on.");
            return;
        }

        if (cpu == null) {
            System.out.println("Problem found: CPU is missing");
            return;
        } else if (ram == null) {
            System.out.println("Problem found: RAM is missing");
            return;
        } else if (hardDrive == null) {
            System.out.println("Problem found: Hard drive is missing");
            return;
        }
        isOn = true;
        System.out.println("The computer is on.");

    }

    public void turnOff() {
        if (!isOn) {
            return;
        }
        isOn = false;
        System.out.println("The computer is off.");
    }

    public void createFile(long fileSize) {
        if (!isOn) {
            System.out.println("Problem found: The computer is off. Cannot create the file.");
            return;
        }

        long newCapacity = hardDrive.getUsedSpace() + fileSize;
        if (newCapacity > hardDrive.getCapacity()) {
            System.out.println("Problem found: Not enough space on the hard drive.");
            return;
        }
        hardDrive.setUsedSpace(newCapacity);

    }

    public void deleteFile(long fileSize) {
        if (!isOn) {
            System.out.println("Problem found: The computer is off. Cannot delete the file.");
            return;
        }
        long newCapacity = hardDrive.getUsedSpace() - fileSize;
        if (newCapacity < hardDrive.getCapacity()) {
            System.out.println("Problem found: No file to delete.");
            return;
        }
        hardDrive.setUsedSpace(newCapacity);
    }

    @Override
    public String toString() {
        return "Computer{" +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", hardDrive capacity: " + hardDrive.getCapacity() +
                ", hardDrive used space: " + hardDrive.getUsedSpace() +
                '}';
    }
}
