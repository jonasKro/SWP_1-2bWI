package at.Jonas.examples.Phone;
import java.util.ArrayList;

public class Phone {
    private Simcard simcard;
    private  Memorycard memorycard;
    private  Camera camera;
    private ArrayList<Photofile> photofiles;

    public Phone(Simcard simcard, Memorycard memorycard, Camera camera) {
        this.simcard = simcard;
        this.memorycard = memorycard;
        this.camera = camera;
        this.photofiles = new ArrayList<>();
    }

    public Simcard getSimcard() {
        return simcard;
    }

    public void setSimcard(Simcard simcard) {
        this.simcard = simcard;
    }

    public Memorycard getMemorycard() {
        return memorycard;
    }

    public void setMemorycard(Memorycard memorycard) {
        this.memorycard = memorycard;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
    public void takePic(String Name){
        if (memorycard.getMemcap() > memorycard.getMemory()){
            photofiles.add(camera.getPhotofile(Name));
            memorycard.setMemory(memorycard.getMemory()+ (camera.getRes()*10));
            System.out.println("picture named "+Name+" was taken");
            System.out.println("you have "+(memorycard.getMemcap()- memorycard.getMemory())+" memory left");
        }
        else{
            System.out.println("your sd card is full");
        }
    }
    public void getPhotos(){
        for (int i = 0; i < photofiles.size();i++){
            System.out.println(photofiles.get(i).getName());
        }
    }
}
