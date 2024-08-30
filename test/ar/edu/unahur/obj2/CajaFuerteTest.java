package ar.edu.unahur.obj2;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class CajaFuerteTest {
    @Test
    public void creacionCajaFuerte(){
        //preparacion
        Integer reset = 4321;
        CajaFuerte cajaFuerte1 = new CajaFuerte(reset);
        Boolean valorEsperado = true;
        //ejecucion
        Boolean valorObtenido = cajaFuerte1.tieneClave();
        //contrastacion
        assertEquals(valorEsperado,valorObtenido);
        //limpieza
    }

    CajaFuerte cajaFuerte = new CajaFuerte(4321);
    @Test
    public void crearClave(){
        // //preparacion
        Integer clave = 2345;
        Boolean valorEsperado = true;
        //ejecucion
        cajaFuerte.crearClave(clave);
        Boolean valorObtenido =  cajaFuerte.getClave()==clave;
        //contrastacion
        assertEquals(valorEsperado,valorObtenido);
    }

    @Test
    public void cerrarCajaFuerte(){
        // //preparacion
        Integer clave = 2345;
        cajaFuerte.crearClave(clave); // o setClave = clave ????????
        cajaFuerte.setPuertaAbierta(false);
        Boolean valorEsperado = true;
        //ejecucion
        cajaFuerte.cerrarCajaFuerte(clave);
        Boolean valorObtenido = cajaFuerte.getEstaCerrada();
        //contrastacion
        assertEquals(valorEsperado,valorObtenido);
    }

    @Test
    public void abrirCajaFuerte(){
        //preparacion
        Integer clave = 235;
        cajaFuerte.crearClave(clave);   //genero clave
        cajaFuerte.setPuertaAbierta(false); //cierro puerta
        cajaFuerte.cerrarCajaFuerte(clave); // cierro la caja
        Boolean valorEsperado = false;
        //ejecucion
        cajaFuerte.abrirCajaFuerte(1);
        cajaFuerte.abrirCajaFuerte(2);
        cajaFuerte.abrirCajaFuerte(clave);
        //cajaFuerte.abrirCajaFuerte(clave);
        Boolean valorObtenido = cajaFuerte.getEstaCerrada();
        //contrastacion
        assertEquals(valorEsperado,valorObtenido);
    }

    @Test
    public void desbloquearCajaFuerte(){
        //preparacion
        Integer clave = 235;
        Integer res= 4321;
        cajaFuerte.crearClave(clave);   //genero clave
        cajaFuerte.setPuertaAbierta(false); //cierro puerta
        cajaFuerte.cerrarCajaFuerte(clave); // cierro la caja
        cajaFuerte.abrirCajaFuerte(1);
        cajaFuerte.abrirCajaFuerte(2);
        cajaFuerte.abrirCajaFuerte(3);
        cajaFuerte.abrirCajaFuerte(4);
        Boolean valorEsperado = false;
        //ejecucion
        cajaFuerte.desbloquearCajaFuerte(res);
        Boolean valorObtenido = cajaFuerte.getEstaCerrada();
        //contrastacion
        assertEquals(valorEsperado,valorObtenido);
    }

    @Test
    public void cambioReset(){
        //preparacion
        Integer nuevaReset = 1111;
        CajaFuerte cajaFuerte = new CajaFuerte(4321);
        Boolean valorEsperado = true;
        //ejecucion
        cajaFuerte.cambioReset(nuevaReset);
        Boolean valorObtenido = cajaFuerte.getReset().equals(nuevaReset);
        //contrastacion
        assertEquals(valorEsperado,valorObtenido);
    }

}