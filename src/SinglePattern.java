//GirlFriend饿汉式设计模式
//BoyFriend懒汉式设计模式
public class SinglePattern {
    public static void main(String[] args) {
        GirlFriend AGirlFriend = GirlFriend.getInstance();
        GirlFriend BGirlFriend = GirlFriend.getInstance();
        System.out.println(AGirlFriend);
        System.out.println(BGirlFriend);
        System.out.println(AGirlFriend == BGirlFriend);
    }
}
//饿汉式
class GirlFriend{
    private String name;
    private GirlFriend(String name){
        this.name = name;
    };
    private static GirlFriend Instance = new GirlFriend("Jennifer");

    public static GirlFriend getInstance() {
        return Instance;
    }

    @Override
    public String toString() {
        return "name = " + name;
    }
}
//懒汉式
class BoyFriend{
    private String name;
    private static BoyFriend Instance;
    private BoyFriend(String name){
        this.name = name;
    }
    public static BoyFriend getInstance() {
        if(Instance == null){
            Instance = new BoyFriend("Mike");
        }
        return Instance;
    }
}