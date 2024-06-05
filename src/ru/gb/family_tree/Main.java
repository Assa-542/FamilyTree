package ru.gb.family_tree;

import ru.gb.family_tree.familyTree.FamilyTree;
import ru.gb.family_tree.human.Gender;
import ru.gb.family_tree.human.Human;

import java.io.Serializable;
import java.time.LocalDate;


public class Main implements Serializable {
    public static void main(String[] args) {
        FamilyTree familytree = new FamilyTree();
        Human Natasha = new Human("Anastasia", Gender.Female, LocalDate.of(1952, 4, 28));
        Human Ivan = new Human("Ivan", Gender.Male, LocalDate.of(1950, 5, 21));
        Human Galina = new Human("Galina", Gender.Female, LocalDate.of(1944, 5, 19));
        familytree.addRalative(Natasha);
        familytree.addRalative(Ivan);
        familytree.addRalative(Galina);
        Human Anatoly = new Human("Anatoly", Gender.Male, LocalDate.of(1976, 11, 4), Natasha, Ivan);
        familytree.addRalative(Natasha);
        familytree.addRalative(Anatoly);
        Human Nastya = new Human("Nastya", Gender.Female, LocalDate.of(1998, 5,11), Natasha, Anatoly);
        familytree.addRalative(Nastya);
        System.out.println(familytree);


    }


}