package packageA;

class AccessModifier {
    public static void main( String[] args ) {

        Person person = new Person();

        person.getGender(); // This is accessible as this is public.

        if( person.name ) {
            System.out.println("Name: " + person.name); // We will get an error as this data is protected.
        } else {
            System.out.println("Name is a private variable of class Person, so we cannot access it outside the class");
        }
    }
}