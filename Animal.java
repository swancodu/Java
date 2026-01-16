class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    //override
    void sound(){
        System.out.println("Dog barks");
    }
}
class Test{
    public static void main(String[]args){
        Animal a = new Dog();
        a.sound();
    }
}