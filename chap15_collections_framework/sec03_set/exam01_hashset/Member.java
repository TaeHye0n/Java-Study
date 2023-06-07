package chap15_collections_framework.sec03_set.exam01_hashset;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Member) {
            Member member = (Member) o;
            return member.name.equals(name) && (member.age == age);
        }
        else return false;
    }

    @Override
    public int hashCode(){
        return name.hashCode() + age;
    }
}
