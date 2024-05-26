package homework;

public class Main{
    public static void main(String[] args){
//        User user = new User("Bob");
//        user.report();
//        user.save();
        ReportManager reportManager = new ReportManager();
        Persister persister = new Persister();
        User user1 = new User("Bob");
        Administrator administrator1 = new Administrator("Josh");
        reportManager.report(user1);
        reportManager.report(administrator1);
        System.out.println();
        persister.save(user1);
        persister.save(administrator1);

    }
}