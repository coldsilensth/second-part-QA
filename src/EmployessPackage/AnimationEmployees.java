package EmployessPackage;

import EmployessPackage.Animation.Animator;
import EmployessPackage.Animation.Directed;
import EmployessPackage.Animation.Screenwriter;

public class AnimationEmployees extends Employees {
    public static void main(String[] args) {
        String[] skill = new String[3];

        skill[0] = "Рисовать лица";
        skill[1] = "Рисовать задний фон";
        skill[2] = "Рисовать персонажей";

        Animator animator = new Animator();
        animator.skillAnimator(skill);

        System.out.println("_________________________");

        String[] genre = new String[5];
        genre[0]  = "Драма";
        genre[1]  = "Комедия";
        genre[2]  = "Детектив";

        Screenwriter screenwriter = new Screenwriter();
        screenwriter.write(genre);

        System.out.println("_________________________");

        String[] list = new String[5];

        list[0] = "Логотип";
        list[1] = "Заставка";
        list[2] = "Эндинг";

        Directed directed = new Directed();
        directed.practice(list);

    }
}
