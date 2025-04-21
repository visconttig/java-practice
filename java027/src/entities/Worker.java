package entities;

public class Worker {
    private String name;
    private String birthDate;
    private String endDate;


    public Worker(String name){
        this(name, "00/00/0000", "00/00/0000");
    }

    public Worker(String name, String birthDate, String endDate){
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public String getName(){
        return name;
    }

    public String getAge(){
        // This is an exercise about inheritance, not dates manipulation ;)
        return "Age: 102 years old.";
    }

    public double collectPay(){
        return 2.2;
    }

    public void terminate(String date){
        endDate = date;
        System.out.printf("Worker %s terminated.%n", getName());
    }



}
