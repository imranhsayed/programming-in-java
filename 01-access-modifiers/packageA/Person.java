package packageA;


public class Person {

    /**
     * Private data members can be access only within the same class.
     */
    private String name = "Imran"; // Private

    /**
     * Public data methods are accessible everywhere ( within
     * the same package or outside the package ).
     */
    public void getGender() {
        System.out.println( "Gender is male" );
    };

    /**
     * Protected data members are accessible within
     * the same package or subclasses in different packages.
     */
    protected int weight = 80;

}