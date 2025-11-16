// LC and RP

class Driver{
    // Loose Coupling (accepts all different sub types and allows to change)
    void drive(Vehicle v){
        v.engine();         // executed from vehicle implementation classes

        v.breaks();         // based on the runtime object passed as argument
    }
}