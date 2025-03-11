public class Manvendra {
    private static Manvendra manav;
    
        private Manvendra(){}
    
        private static synchronized Manvendra getInstance(){
            if(manav == null){
                manav = new Manvendra();
        }
        return manav;
    }

}


class Ajay{
    private static final Ajay instance = new Ajay();// early instatiation
    public int age;
    public String name;

    private Ajay(){
        this.age = 27;
        this.name = "Manvendra";
    }

    public static synchronized Ajay getInstance(){
        return instance;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setValues(int age, String name){
        this.name = name;
        this.age = age;
    } 

    public static void main(String[] args) {
        Ajay obj = instance.getInstance();
        System.out.println(obj.getAge()+ " " + obj.getName());
        obj.setValues(1, "Manav");

        System.out.println(obj.getAge()+ " " + obj.getName());
    }


}