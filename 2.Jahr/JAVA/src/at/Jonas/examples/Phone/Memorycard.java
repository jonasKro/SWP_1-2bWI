package at.Jonas.examples.Phone;

public class Memorycard {
    private int memcap;
    private int memory;

    public Memorycard(int memcap) {
        this.memcap = memcap;
    }

    public int getMemcap() {
        return memcap;
    }

    public void setMemcap(int memcap) {
        this.memcap = memcap;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
