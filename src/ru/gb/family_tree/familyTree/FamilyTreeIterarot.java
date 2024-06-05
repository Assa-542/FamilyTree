package ru.gb.family_tree.familyTree;

import ru.gb.family_tree.human.Human;

import java.util.Iterator;
import java.util.List;

public class FamilyTreeIterarot implements Iterator<Human> {
    private List<Human> list;
    private int index;

    public FamilyTreeIterarot(List<Human> list ) {
        this.list = list;
        index = 0;

    }
    @Override
    public boolean hasNext() { return index < list.size(); }

    @Override
    public Human next() { return  list.get(index++); }
}
