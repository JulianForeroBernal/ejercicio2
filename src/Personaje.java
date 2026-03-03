public class Personaje {
    private String nombre;
    private int nivel;
    private int xp;
    private int vida;
    private boolean vivo;
    public Personaje(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.xp = 0;
        this.vida = 100;
        this.vivo = true;
    }
    public String getNombre() {
        return nombre;
    }
    public int getNivel() {
        return nivel;
    }
    public int getXp() {
        return xp;
    }
    public int getVida() {
        return vida;
    }
    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", xp=" + xp +
                ", vida=" + vida +
                ", vivo=" + vivo +
                '}';
    }
    public void ganarXp(int cantidad){
        this.xp += cantidad;
    }
    public void subirNivel(){
        this.nivel += 1;
        this.xp = 0;
    }
    public boolean recibirDaño(int daño){
        this.vida -= daño;
        if (this.vida == 0){
            this.vivo = false;
        }
        return this.vivo;
    }
    public void curarse(int curacion){
        this.vida += curacion;
    }
}
