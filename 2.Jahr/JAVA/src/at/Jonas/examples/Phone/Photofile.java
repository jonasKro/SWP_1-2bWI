package at.Jonas.examples.Phone;

public class Photofile {
    private String filetype;
    private int size;
    private String name;

    public Photofile(String filetype, int size, String name) {
        this.filetype = filetype;
        this.size = size;
        this.name = name;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
