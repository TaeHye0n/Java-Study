package chap14_lambda.sec05_std_api_func_interface.exam07_andthen_compose;

public class Member {
    private String name;
    private String id;
    private Address address;

    public Member(String name, String id, Address address){
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }
}
