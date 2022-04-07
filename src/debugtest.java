import java.util.HashMap;

public class debugtest {
    public static void main(String[]args){
        HashMap <String,String>map=new HashMap<>();
        map.put("name","tom");

        map.put("major","computer");
        map.put("school","tsinghua");
        String name=map.get("name");
        map.remove("major");
        System.out.println("-----");

    }
}
