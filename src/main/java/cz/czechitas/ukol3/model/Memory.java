package cz.czechitas.ukol3.model;

public class Memory {

    private long memory;

    public long getMemory() {
        return memory;
    }

    public void setMemory(long memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "memory=" + memory +
                '}';
    }
}
