package POO.BasicPoo;
class Computer{
    public void playMusic(){
        System.out.println("Music Playing...");
    }

    public String getMeAPen(int cost){
        if(cost >= 10)
            return "Pen";
        
        return "Nothing";
    }
}

public class Methods {
    public static void main(String[] args) {
        Computer ojb = new Computer();
        ojb.playMusic();
        String str = ojb.getMeAPen(10);
        System.out.println(str);
    }
}
