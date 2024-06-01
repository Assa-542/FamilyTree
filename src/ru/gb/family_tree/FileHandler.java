package ru.gb.family_tree;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileHandler implements Writable {
    public FileHandler() {

    }

    public void save(Serializable stream, String path) throws IOException {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path));

            try {
                out.writeObject(stream);
            } catch (Throwable var7) {
                try {
                    out.close();
                } catch (Throwable var6) {
                    var7.addSuppressed(var6);
                }

                throw var7;
            }

            out.close();
        } catch (Exception var8) {
            System.out.println("Сериализация не работает" + var8);
        }

    }

    public Object load(String path) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
        return objectInputStream.readObject();
    }
}
