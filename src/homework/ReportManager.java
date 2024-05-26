package homework;

public class ReportManager implements Reportable{
    @Override
    public void report(Account account) {
        System.out.println("Report for "+ account.getClass().getSimpleName()+" : " + account.getName());
    }
}
