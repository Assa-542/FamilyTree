package ru.gb.family_tree;

import java.io.IOException;
import java.io.Serializable;

public interface Writable {
    void Save (Serializable var1, String var2) throws IOException;

    Object load(String var1) throws IOException, ClassNotFoundException;
}

