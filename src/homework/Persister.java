package homework;

public class Persister implements Saved{


    public void save(Account account){
        System.out.println("Save "+account.getClass().getSimpleName()+" : " + account.getName());
    }
}
