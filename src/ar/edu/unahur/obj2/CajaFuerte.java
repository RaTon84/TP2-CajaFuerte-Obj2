package ar.edu.unahur.obj2;

public class CajaFuerte {
    private Integer reset;
    private Boolean estaCerrada;
    private Integer clave;
    private Boolean puertaAbierta;
    private Integer intentos;
    private Boolean estaEnModoRoot;

    public CajaFuerte(Integer reset) {
        this.reset = reset;
        this.puertaAbierta = true;
        this.clave = null;
        this.estaCerrada = false;
        this.intentos = 2;
    }

    public Integer getClave() {
        return clave;
    }
    public Boolean getEstaCerrada() {
        return estaCerrada;
    }
    public void setPuertaAbierta(Boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }
    public Boolean tieneClave(){
            return clave == null;
    }
    public void crearClave(Integer clave) {
        this.clave = clave;
    }
    public void cerrarCajaFuerte(Integer clave) {
        if (puertaAbierta){
            System.out.println("cierre la puerta antes"); //preguntar si se hacen test a los get
        } else if (this.clave != clave) {
            System.out.println("clave incorrecta");
        }else {
            this.estaCerrada = true;
        }
    }
    public void abrirCajaFuerte(Integer clave) {
        if (intentos < 0) {
            System.out.println("bloqueada, llame al conserje");
            intentos -= 1;
        } else if (this.clave != clave) {
            System.out.println("clave incorrecta, le quedan " + intentos + " intentos");
            intentos -= 1;
        } else {
            this.estaCerrada = false;
            this.intentos = 2;
        }
    }
    public void desbloquearCajaFuerte(Integer reset) {
        if (this.reset.equals(reset)) { ///usar el this o get o nada?, al comparar son objetos
            this.estaCerrada = false;
            this.clave = null;
            this.intentos = 2;
        }
    }
}
