package at.Jonas.examples.Phone;

public class Camera {
    private int res;
    private Photofile photofile;

    public Camera(int res) {
        this.res = res;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public Photofile getPhotofile(String filename){
        Photofile p1 = new Photofile("jpg",10*this.res, filename);
        return p1;
    }
}
