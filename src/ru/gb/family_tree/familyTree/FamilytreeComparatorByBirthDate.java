package ru.gb.family_tree.familyTree;

import FamilyTree.human.Human;
import ru.gb.family_tree.human.Human;

import java.util.Comparator;
public class FamilytreeComparatorByBirthDate implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) { return o1.getBirthDate().compareTo(o2.getBirthDate()); }
}
