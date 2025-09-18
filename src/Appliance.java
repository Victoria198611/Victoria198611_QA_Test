public abstract class Appliance {
 abstract void turnOn();
 }
 class WashingMachine extends Appliance{
    @Override
     void turnOn() {
        System.out.println("Washing mashine is now ON");
    }
 }
 class Fridge extends Appliance{
    @Override
     void turnOn (){
        System.out.println("Fridge is cooling");
    }
 }
 class Main5{
    public static void main (String [] args){
        Appliance washingMachine= new WashingMachine();
        Appliance fridge= new Fridge();
        washingMachine.turnOn();
        fridge.turnOn();
    }
 }
