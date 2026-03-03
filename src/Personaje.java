public class Personaje {
    private String nombre;
    private int nivel;
    private int xp;
    private int vida;
    private boolean vivo;
    public Personaje(String nombre, int nivel, int xp, int vida, boolean vivo) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.xp = xp;
        this.vida = vida;
        this.vivo = vivo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getXp() {
        return xp;
    }
    public void setXp(int xp) {
        this.xp = xp;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public boolean isVivo() {
        return vivo;
    }
    public void setVivo(boolean vivo) {
        this.vivo = vivo;
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
}
