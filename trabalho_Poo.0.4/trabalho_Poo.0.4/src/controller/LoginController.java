package controller;


import java.sql.ResultSet;

import javax.swing.JOptionPane;


import modelo.dao.LoginDao;
import modelo.entidade.Funcionario;
import modelo.service.FuncionarioService;
import modelo.service.LoginService;
import view.LoginSenha;

public class LoginController {
	
	private Funcionario  funcionario ;
	
	public ResultSet login (LoginSenha frame ) {
		
		Funcionario funcionario = new Funcionario();
		ResultSet lconsulta ;
	
		
		
		funcionario.setNome(frame. getTxtLogin().getText());
	    funcionario.setSenha(frame.getTxtSenha().getText());
	    
	    
	 
	    	 LoginDao login =  new LoginDao();
	         lconsulta =	 login.login(funcionario);
	    	 
	    	 
	    	 
	         return  lconsulta ;     
                                  
      
		
	
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
