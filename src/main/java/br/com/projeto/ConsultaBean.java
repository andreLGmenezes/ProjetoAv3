package br.com.projeto;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;

import entidades.Consulta;
import services.ConsultaService;

@ManagedBean
public class ConsultaBean {
    @Autowired
    private ConsultaService consultaService;
    private Consulta consulta = new Consulta();
    
    public Consulta getConsulta() {
        return consulta;
    }
    
    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
    
    public void save() {
        consultaService.save(consulta);
    }
}
