package ru.gb.family_tree.familyTree;

import familyTree.human.Human;
import ru.gb.family_tree.human.Human;

import java.util.Comparator;

public class FamilyTreeComparatorByName implements Comparator<Human>{
    @Override
    public int compare(Human o1, human o2) {return o1.getname().compareTo(o2.getname()); }
}
