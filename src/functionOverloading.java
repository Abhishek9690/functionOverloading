public class functionOverloading {
    void Btech(){
        System.out.println("btech from cs");
    }
    void Btech(int amount){
        System.out.println("Btech from ec");
    }

    public static void main(String[] args) {
        functionOverloading obj =new functionOverloading();
        obj.Btech(10000);
    }


}
