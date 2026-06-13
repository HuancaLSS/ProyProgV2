package OfertaAcademica;

import java.io.*;

public class ArchUniversidad {

    private String nomA;

    public ArchUniversidad(String nomA) {
        this.nomA = nomA;
    }

    public void guardar(Universidad U) throws IOException {

        ObjectOutputStream arch =
                new ObjectOutputStream(
                        new FileOutputStream(nomA));

        arch.writeObject(U);

        arch.close();
    }

    public Universidad leer()
            throws IOException, ClassNotFoundException {

        ObjectInputStream arch =
                new ObjectInputStream(
                        new FileInputStream(nomA));

        Universidad U =
                (Universidad) arch.readObject();

        arch.close();

        return U;
    }
}