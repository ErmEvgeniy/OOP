package Students;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Student firstStudent = new Student("Andrew", "France");
//        Student secondStudent = new Student("Peter", "England");
//        Student thirdStudent = new Student("George", "America");
//        Student fourthStudent = new Student("Maria", "Italy");
//
//        Student[] students = new Student[2];
//
//            students[0] = firstStudent;
//            students[1] = secondStudent;
//
//            for (Student student : students) {
//                student.meetInAirport("6");
//                student.transferToHotel("Radisson hotel");
//                student.teach("Economic");
//                int StudentMoney = student.getMoney();
//                System.out.println("Student " + student.name + " payed " + StudentMoney);
//                student.goToHome();
//                student.showKnowledge();
//            }
//
//         ArrayList<Student> student = new ArrayList<>(2);
//            student.add(thirdStudent);
//            student.add(fourthStudent);
//            for (Student student34 : student) {
//                student34.meetInAirport("8");
//                student34.transferToHotel("Marriot");
//                student34.teach("Management");
//                int StudentMoney = student34.getMoney();
//                System.out.println("Student " + student34.name + " payed " + StudentMoney);
//                student34.goToHome();
//                student34.showKnowledge();


       // Создание студентов
        Student firstStudent = new Student("Peter", "England");
        Student secondStudent = new Student("Andrew", "France");

        //        Создание учителей
        Teacher economicTeacher = new Teacher("Alex", "Economic");
        Teacher managementTeacher = new Teacher("Svetlana", "Management");
        Teacher lowTeacher = new Teacher("Petr", "Low");

        Assistant assistant = new Assistant("Nikolay");


        //встреча в аэропорту
        assistant.meetStudent(firstStudent, "6", "Domodedovo");
        assistant.meetStudent(secondStudent, "8", "Sheremetevo");

        //   Обучение студентов учителями разных предметов
        lowTeacher.teachStudent(firstStudent);
        lowTeacher.teachStudent(secondStudent);
        economicTeacher.teachStudent(firstStudent);
        managementTeacher.teachStudent(secondStudent);

        // проверка знаний

        System.out.println("Assistant check knowledge");
        assistant.checkKnowledge(firstStudent);
        assistant.checkKnowledge(secondStudent);


        //        Взять со студента деньги
        int firstStudentMoney = firstStudent.getMoney();
        assistant.collectMoney(firstStudent);
        System.out.println(firstStudentMoney);
        int secondStudentMoney = secondStudent.getMoney();
        assistant.collectMoney(secondStudent);
        System.out.println(secondStudentMoney);

        // проводил домой

        assistant.goToHome(firstStudent);
        assistant.goToHome(secondStudent);






             //   Обучение студентов учителями разных предметов
//        lowTeacher.teachStudent(firstStudent);
//        lowTeacher.teachStudent(secondStudent);
//        economicTeacher.teachStudent(firstStudent);
//        managementTeacher.teachStudent(secondStudent);
//
//        //        Проверка знаний студентов учителями
//        System.out.println("Teachers check knowledge");
//        lowTeacher.checkKnowledge(firstStudent);
//        lowTeacher.checkKnowledge(secondStudent);
//
//        //        Проверка знаний у студентов напрямую
//        System.out.println("We check knowledge");
//        firstStudent.showKnowledge();
//        secondStudent.showKnowledge();

        //        Взять со студента деньги
//        int firstStudentMoney = firstStudent.getMoney();
//        System.out.println("Student " + firstStudent.name + " payed " + firstStudentMoney);
//        int secondStudentMoney = secondStudent.getMoney();
//        System.out.println("Student " + secondStudent.name + " payed " + secondStudentMoney);


    }
        }



