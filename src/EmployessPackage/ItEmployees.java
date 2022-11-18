package EmployessPackage;

import Companyes.ItCompany;
import EmployessPackage.IT.*;

public class ItEmployees extends Employees {
    public static void main(String[] args) {
        String[] list = new String[5];
        list[0] = "SMM";
        list[1] = "Проект какой-то";
        list[2] = "Топ проектик";
        list[3] = "Проект рекламный";

        ProjectManager manager = new ProjectManager();
        manager.work(list);

        System.out.println("_________________________");

        String[] programLanguage = new String[5];

        programLanguage[0] = "Java";
        programLanguage[1] = "C#";
        programLanguage[2] = "JavaScript";

        Developer developer = new Developer();
        developer.develop(programLanguage);

        System.out.println("_________________________");

        Tester tester = new Tester();
        tester.test();

        System.out.println("_________________________");

        ManualTester tester1 = new ManualTester();
        tester1.manualTest();

        System.out.println("_________________________");

        AutoTester tester2 = new AutoTester();
        tester2.autoTester();
    }
}
