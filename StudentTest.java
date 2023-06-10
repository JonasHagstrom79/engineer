public class StudentTest {

    public int id;
    public String name;
    public String gender;


    public static void main(String[] args) {
        
        

        StudentTest s = new StudentTest();
        
        s.id = 1;
        s.name = "John";
        s.gender = "male";
        
        System.out.println(s.id);
        System.out.println(s.name);
        System.out.println(s.gender);

        s.setId(1337);

        System.out.println(s.id);
        
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public int getId() {
        return id;
    }
}
