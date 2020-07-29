package Students;

public class Assistant {

    private String name;

    public Assistant(String name){
        this.name = name;

    }

    //    Встреча в аэропорту
    public void meetStudent(Student student,String time, String airportName){
        System.out.println("Student " + student.name + " was met in airport in " + time);
        student.meetInAirport (time, airportName);
    }

    //    Проверка знаний у студента (вызов метода для демонстрации предметов, записанных в студенте)
    public void checkKnowledge(Student student){
        student.showKnowledge();
        System.out.println("Student " + student.name + " told about his knowledge" );
    }
    public int collectMoney (Student student){
        int money = student.getMoney();
        System.out.print("Student " + student.name + " payed for knowledge ");
        return money;
    }

    public void goToHome (Student student) {
        System.out.println("Student " + student.name + " fiy to home " + student.country);
        student.goToHome();
    }
}



