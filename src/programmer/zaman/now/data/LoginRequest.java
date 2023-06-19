package programmer.zaman.now.data;

//constructornya langsung diclass
//wajib menambahkan data di constructor
// data yang dimasukan == field dari record
public record LoginRequest(String username, String password)  {

    //membuat  contructor utama, dengan cara tanpa menggunakan "()"
    public LoginRequest{
        System.out.println("membuat object loginRequest");
    }

    public LoginRequest(String username){
        this(username, "");
    }

    public boolean sayHello(){
        System.out.println("hello"+this.username);
        return false;
    }

}
