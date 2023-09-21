public class Persona {
    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas = 0;


    //Constructor vacio
    public Persona(){
        this.id = ++Persona.numeroPersonas;
    }

    //Empty constructor

    public Persona(String nombre, String tel, String email){
        this();//Calling the empty constructor
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", name='" + nombre + '\'' +
                ", phone='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan Perez", "55555", "juan@hotmail.com");
        System.out.println(persona1);
    }
}
