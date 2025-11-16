import java.util.Scanner;
class BusDepo{
    public static void main(String[] args){
        try{
       Driver pk =new Driver();

      //  pk.drive(new RedBus());

       // pk.drive(new Volvo());
       //pk.drive(new SL());

       Scanner scn = new Scanner(System.in);
       System.out.println("Enter class name : ");
       String clsName = scn.next();

       Class cls = Class.forName(clsName);
          
       Object obj = cls.newInstance();
       Vehicle v = (Vehicle) obj;
        pk.drive(v);
        }catch(Exception e){
            e.printStackTrace();
        }
      
    }
}