package Lessons.lesson11;

public class TestThis {

    int num = 10;
    int num2 = 30;


    public void main(String[] args) {
        int num = 20;
        System.out.println(num); // 20
        System.out.println(this.num); // 10
        System.out.println(num2); // 30
    }


}
