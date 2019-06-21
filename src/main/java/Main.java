public class Main {

    public static void main(String[] args) {
        try {
            ( new TwoWaySerialComm() ).connect( "/dev/ttyUSB0" );
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }

}
