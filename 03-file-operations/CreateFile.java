import java.io.File;

/**
 *
 */
public class CreateFile {
    public static void main( String[] args ) {
        // Create file object.
        File file = new File( "src/programming-in-java/03-file-operations/new-file.txt" );
        try {

            if ( file.createNewFile() ) {
                System.out.println( "New file is created" );
            } else {
                System.out.println( "File already exists" );
            }

            // Print absolute path.
            System.out.println( file.getAbsolutePath() );

            // Check if the file is readable and writable.
            System.out.println( file.canRead() );
            System.out.println( file.canWrite() );

        } catch ( Exception error ) {
            error.getStackTrace();
        }

    }
}