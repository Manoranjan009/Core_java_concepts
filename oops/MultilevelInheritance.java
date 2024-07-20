package com.cglia.training.oops;

class colours{
    public void colour(){
        System.out.println("The car colour is Black");
    }
}
class engines extends colours{
    public void engine(){
        System.out.println("This model car have V8 engine");
    }
}
class Honda extends engines{
    public void modelname(){
        System.out.println("The car modelname is Honda city");
    }
}
public class MultilevelInheritance extends Honda {
    public static void main(String[] args) {
        MultilevelInheritance car = new MultilevelInheritance();
        car.colour();
        car.engine();
        car.modelname();
    }
}
