package Students;

public class Teacher {
    private String name;
    private String subject;

    //    Конструктор. Вызывается единожды при создании учителя, передаем имя и предмет (см класс Main)
    public Teacher(String name, String subject){ // Необходимые параметры для создания учителя
        this.name = name;
        this.subject = subject;
    }

       // Метод для обучения студента своему предмету
    public  Teacher teachStudent(Student student){
        student.teach(subject);
        System.out.println("Student " + student.name + " was teached for " + subject);
        return null;
    }

    //    Проверка знаний у студента (вызов метода для демонстрации предметов, записанных в студенте)
    public void checkKnowledge(Student student){
        student.showKnowledge();
        System.out.println("Student " + student.name + " told about his knowledge");
    }
}