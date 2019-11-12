package enthuware.ocajp.i.v8_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Q_1047 {

    protected InputStream m1() throws Exception {
        return new FileInputStream("");
    }
}

class Sub extends Q_1047 {

    @Override
    protected FileInputStream m1() throws FileNotFoundException {
        return new FileInputStream("");
    }
}