package com.nil.web.api.handler;


public class CampoObrigatorioException extends BusinessException{

    public CampoObrigatorioException(String campo) {
        super("O campo é %s é obrigatorio ", campo);
    }

    
}
