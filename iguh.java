import java.util.HashMap;
import java.util.List;

public class iguh {
    public static void main(String[] args) {
        DAO<Integer> dao = new DAO<>();
        User user = new User();
        dao.save(user.getName(), user.getId());
        dao.get(user.getName());
        dao.update(user.getName(), user.getId());
        System.out.println("hello,codespace");
    }
}
class DAO<T> {
    HashMap<String, T> map = new HashMap<>();
    public void save(String id,T entity){
        map.put(id,entity);
    }
    public T get (String id){
        return map.get(id);
    }
    public void update(String id,T entity){
        map.replace(id,entity);
    }
    public List<T> list(){
        return (List<T>) map.values();
    }
    public void delete(String id){
        map.remove(id);
    }
}
class User{
    private int id;
    private int age;
    private String name;public static void main(String[] args) {
        
    }
    private String password;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}