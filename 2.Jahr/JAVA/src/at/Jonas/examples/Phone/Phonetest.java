package at.Jonas.examples.Phone;

public class Phonetest {
    public static void main(String[] args){

    Camera c1 = new Camera(4000);
    Simcard s1 = new Simcard(132452, "67761325336");
    Memorycard m1 = new Memorycard(3200000);
    Phone phone = new Phone(s1,m1,c1);
        System.out.println(phone.getMemorycard().getMemcap());
    phone.takePic("jonas");
    phone.takePic("einorg");
    phone.getPhotos();




    }
}
