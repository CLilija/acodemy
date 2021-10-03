package object;

public class Main {
    public static void main(String[] args) {

        Person john = new Person();
       // john.name = "John";
        john.setName("John");
        //john.surname = "Doe";
        //john.age = 20;
        //john.weight = 70.6;
        //john.isHetero = true;
        john.retrieveInformation();

//        Person nataly = new Person();
//        nataly.name = "Nataly";
//        nataly.surname = "Rostova";
//        nataly.age = 18;
//        nataly.weight = 63;
//        nataly.isHetero = false;
//        nataly.retrieveInformation();

        Person andrey = new Person("Andrey", "Velikanov");
//        andrey.age = 21;
        andrey.setAge(22);
//        andrey.weight = 60.3;
        andrey.setWeight(65);
//        andrey.isHetero =false;
        andrey.setHetero(false);
        andrey.retrieveInformation();

        Person angelica = new Person("Angelica", "Varum", 52, 65.50, false);
        angelica.retrieveInformation();

        Person anna = new Person("Anna", "Kovaljeva",30);
        anna.setAge(31);

    }
}
