package entities;

import java.util.Calendar;

public class Worker {
    private String name;
    private String birthDate;
    private String endDate;


    public Worker(String name){
        this(name, "03/04/1981", "00/00/0000");
    }

    public Worker(String name, String birthDate, String endDate){
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public String getName(){
        return name;
    }

    public void getAge(){
        // example 11/22/1234
        int birthYear = Integer.parseInt(birthDate.substring(6));
        System.out.printf("Birth year: %d%n", birthYear);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        System.out.printf("Current year: %d%n", currentYear);
        System.out.print(String.format("%s is %d years old.",
                getName(), currentYear - birthYear));
    }

    public double collectPay(){
        return 2.2;
    }

    public void terminate(String date){
        endDate = date;
        System.out.printf("Worker %s terminated.%n", getName());
    }

    @Override
    public String toString() {
        return "Worker {" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
