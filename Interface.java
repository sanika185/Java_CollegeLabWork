import java.util.Scanner;

interface Client {
    void input();
    void output();
}

class ABC implements Client {
    private String name;
    private double salary;

    
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter salary: ");
        salary = sc.nextDouble();
    }

  
    public void output() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class Interface {
    public static void main(String[] args) {
        ABC abc = new ABC();
        abc.input();
        abc.output();
    }
}