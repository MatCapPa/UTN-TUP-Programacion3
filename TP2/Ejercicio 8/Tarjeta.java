public class Tarjeta {
    private String nombre, apellido, mail, telefono, entidadFinanciera, entidadBancaria,nroTarjeta, dni;
    private double saldo;

    public Tarjeta(String nombre, String apellido, String mail, String telefono, String entidadFinanciera, String entidadBancaria, String nroTarjeta, String dni, double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.telefono = telefono;
        this.dni = dni;
        this.entidadBancaria = entidadBancaria;
        this.entidadFinanciera = entidadFinanciera;
        this.nroTarjeta = nroTarjeta;
        this.saldo = saldo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }   
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefono() {
        return telefono;    
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }   

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getentidadBancaria(){
        return entidadBancaria;
    }
    public void setentidadBancaria(String entidadBancaria){
        this.entidadBancaria = entidadBancaria;
    }
    public String getentidadFinanciera(){
        return entidadFinanciera;
    }
    public void setentidadFinanciera(String entidadFinanciera){
        this.entidadFinanciera = entidadFinanciera;
    }
    public String getnroTarjeta(){
        return nroTarjeta;
    }
    public void setnroTarjeta(String nroTarjeta){
        this.nroTarjeta = nroTarjeta;
    }
    public double getsaldo(){
        return saldo;
    }
    public void setsaldo(double saldo){
        this.saldo = saldo;
    }

    public String toString() {
        return "Titular de la Tarjeta: \nNombre: " + nombre + "\nApellido: " + apellido + "\nMail: " + mail + "\nTelefono: " + telefono + "\nDNI: " + dni 
        + "\nDatos de la Tarjeta:"+ "\nEntidad Bancaria: " + entidadBancaria +"\nNro de Tarjeta: " + nroTarjeta +"\nEntidad Financiera: " + entidadFinanciera + "\nSaldo: " + saldo;
    }


}
