
package Formulario;

import Entidades.Ordenados;
import java.util.Date;

public class Pedidos {
    
    private Integer id; 
    private Date momento;
    private Ordenados status;
    
    public Pedidos() { 
            
    }

    public Pedidos(Integer id, Date momento, Ordenados status) {
        this.id = id;
        this.momento = momento;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public Ordenados getStatus() {
        return status;
    }

    public void setStatus(Ordenados status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedidos{" + "id=" + id + ", momento=" + momento + ", status=" + status + '}';
    }



}