package br.com.projeto;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;

import entidades.IMC;
import services.IMCService;

@ManagedBean
public class IMCBean {
    @Autowired
    private IMCService imcService;
    private IMC imc = new IMC();
    
    public IMC getImc() {
        return imc;
    }
    
    public void setImc(IMC imc) {
        this.imc = imc;
    }
    
    public void save() {
        imcService.save(imc);
    }
}
