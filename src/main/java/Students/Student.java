package Students;

import java.util.ArrayList;

public class Student {
   // private String name;
  //  private String country;
    public final String name; // final - чтобы нельзя было присвоить значение после создания студента (только через конструктор при создании, единожды)
    public final String country;
    //    Коллекция всех предметов, которые студент выучил (будет храниться, пока студент существует)
    private ArrayList<String> objects = new ArrayList<>();

        //    Конструктор для создания студента (вызывается единожды при создании студента)
     public Student(String name, String country) {
            this.name = name;
            this.country = country;
        }

        //    Встретить студента
        public void meetInAirport (String time,String airportName) {
            System.out.println("Student was met in " + time + " from " + country + " in  " + airportName);
        }

        //    Проводить в отель
        public void transferToHotel (String hotel){
            System.out.println("Student was transfered in " + hotel);
        }

        //    Обучить студента предмету (предмет записывается в коллекцию и хранится)
        public void teach (String lesson){
            objects.add(lesson);
        }

        //    Собираем плату за обучение (за каждый хранящийся/выученные предмет студент платит 100)
        public int getMoney () {
            int finalMoney = objects.size() * 100;
            return finalMoney;
        }

        //    Отправляем домой
        public void goToHome () {
            System.out.println("Student " + name + " went home ");
        }

        //    Просим студента рассказать чему он научился (демонстрация в цикле всех хранящихся в коллекции предметов)
        public void showKnowledge () {
           // System.out.println("I learned:");
            System.out.println("I'm " + name + ". I learned:");
            for (String object : objects) {
                System.out.println(object);
            }
        }
    }

