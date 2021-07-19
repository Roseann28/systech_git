public class Main {

    public static void main(String[] args) {
        Person alex = new Person("Alex");
        Person alexander=new Person("Alexander");
        Person miriam = alexander;

        System.out.println(alex.name +"  " +miriam.name);

        alex.name="Alexander";
        System.out.println(alex.name + "  " + miriam.name);


    }
        static class Person{
            String name;
            Person(String name){
                this.name=name;

            }

    }
}
