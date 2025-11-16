// inheriatance + polymorphism + encapsulation

class RedBus extends Bus{
    @Override
    public void engine(){
        System.out.println("RB engine capacity 40KMPH");
    }
    // static{
    //     System.out.println("Hi I am RedBus");
    // }
    
}

// we have created the sub type RedBus by using concrete class because all operations