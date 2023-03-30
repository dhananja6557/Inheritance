public class Employee {
    int salary = 50000;
}

class Labour extends Employee {
    int bonus = 10000;
    public static void main(String[] args) {
        Labour l = new Labour();
        System.out.println("Salary is " + l.salary);
        System.out.println("Bonus is " + l.bonus);
    }
}
