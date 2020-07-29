//package Students;
//
//import java.util.ArrayList;
//
//public class FirstStudent {
//    String name;
//    String country;
//    private ArrayList<String> objects = new ArrayList<>();
//
//    public void meetInAirport(String time) {
//
//        System.out.println("Student was met in " + time + "from" + country);
//    }
//
//    public void transferToHotel(String hotel) {
//
//        System.out.println("Student was transfered in " + hotel);
//    }
//
//    public void teach(String lesson) {
//        objects.add(lesson);
//
//    }
//
//    public int getMoney() {
//        int finalMoney = objects.size() * 100;
//        return finalMoney;
//    }
//
//    public void goToHome() {
//
//        System.out.println("Student " + name + "went home");
//    }
//
//    public void showKnowledge() {
//        System.out.println("I learned:");
//        for (String object : objects) {
//            System.out.println(object);
//        }
//    }
//
//}