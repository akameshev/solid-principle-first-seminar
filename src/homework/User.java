package homework;

public class User implements Account{
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    /**
     * Закоментировал метод save. Следуя 1му принципу SOLID - Единственная ответственность.
     * Метод Save реализован только в классе Persister
     */
//    public void save(){
//        Persister persister = new Persister(this);
//        persister.save();
//    }

    public void report(){
        System.out.println("Report for user: " + name);
    }
}
