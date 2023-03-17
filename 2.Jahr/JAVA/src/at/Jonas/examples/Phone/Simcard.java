package at.Jonas.examples.Phone;

public class Simcard {
    private int id;
    private String phonennumber;

    public Simcard(int id, String phonennumber) {
        this.id = id;
        this.phonennumber = phonennumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhonennumber() {
        return phonennumber;
    }

    public void setPhonennumber(String phonennumber) {
        this.phonennumber = phonennumber;
    }

}
