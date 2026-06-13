package OfertaAcademica;

import java.io.*;

public class AddObjectOutputStream extends ObjectOutputStream {

    public AddObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        this.reset();
    }
}