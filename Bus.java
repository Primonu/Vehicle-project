// abstraction + inheritance + polymorphism + encapsulation
abstract class Bus implements Vehicle{
    @Override
    public void breaks(){
        System.out.println("Bus has normal breaks");
    }
}
// we have created sub type object Bus by using abstarct class 