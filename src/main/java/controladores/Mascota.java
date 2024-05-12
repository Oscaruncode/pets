package controladores;

public class Mascota {
    //Atributos
    private int client_id;
    private String nombre_perro;
    private String raza;
    private String color;
    private boolean alergias;
    private boolean cuidados;
    private String dueno;
    private String tel;
    private String observaciones;    

    //Constructores
    public Mascota() {}

    public Mascota(int client_id, String nombre_perro, String raza, String color, boolean alergias, boolean cuidados, String nombre_duenio, String tel, String observaciones) {
    this.client_id = client_id;
    this.nombre_perro = nombre_perro;
    this.raza = raza;
    this.color = color;
    this.alergias = alergias;
    this.cuidados = cuidados;
    this.dueno = nombre_duenio;
    this.tel = tel;
    this.observaciones = observaciones;
    }
    
    
    //Getters

    public int getClient_id() {
        return client_id;
    }

    public String getNombre_perro() {
        return nombre_perro;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public boolean isAlergias() {
        return alergias;
    }

    public boolean isCuidados() {
        return cuidados;
    }

    public String getDueno() {
        return dueno;
    }

    public String getTel() {
        return tel;
    }

    public String getObservaciones() {
        return observaciones;
    }
    
    //Setters

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public void setNombre_perro(String nombre_perro) {
        this.nombre_perro = nombre_perro;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAlergias(boolean alergias) {
        this.alergias = alergias;
    }

    public void setCuidados(boolean cuidados) {
        this.cuidados = cuidados;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    

}



/*


