package cz.czechitas.ukol3.model;

public class Drive {
    public static long capacity;
    public static long usedSpace;

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public long getUsedSpace() {
        return usedSpace;
    }

    public void setUsedSpace(long usedSpace) {
        this.usedSpace = usedSpace;
    }

    @Override
    public String toString() {
        return "Drive{" +
                "capacity=" + capacity +
                ", usedSpace=" + usedSpace +
                '}';
    }
}
