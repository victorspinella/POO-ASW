package controller;





import javax.swing.JOptionPane;

import modelo.dao.FuncionarioDao;
import modelo.dao.LoginDao;
import modelo.entidade.Funcionario;
import modelo.service.FuncionarioService;
import view.AdminManterFuncionario;



public class FuncionarioController {
	
private Funcionario funcionario ;
	
	
	   public void executa(AdminManterFuncionario frame) {
		   
		    funcionario = new Funcionario();
		    
		    funcionario.setNome(frame. getTxtNome().getText());
		    funcionario.setMatricula(Integer.parseInt(frame.getTxtMatricula().getText()));
		    funcionario.setCargo(frame. getTxtCargo() .getText());
		    funcionario.setSenha(frame. getTxtSenha() .getText());
	        
	        FuncionarioService service = new FuncionarioService();
	        
	        service.salvar(funcionario);
	       
		   
		   
	   }
	   
	   
	   
	   
	   
	   
	   public void editar(AdminManterFuncionario frame) {
		   
		    funcionario = new Funcionario();
		    
		    funcionario.setNome(frame. getTxtNome().getText());
		    funcionario.setMatricula(Integer.parseInt(frame.getTxtMatricula().getText()));
		    funcionario.setCargo(frame. getTxtCargo() .getText());
		    funcionario.setSenha(frame. getTxtSenha() .getText());
	        
	        FuncionarioService service = new FuncionarioService();
	        
	        service.editar(funcionario);
	       
		   
		   
	   }
	   
	   
	   
	   public void deleta(AdminManterFuncionario frame) {
		   
		    funcionario = new Funcionario();
		    
		    funcionario.setNome(frame. getTxtNome().getText());
		    funcionario.setMatricula(Integer.parseInt(frame.getTxtMatricula().getText()));
		    funcionario.setCargo(frame. getTxtCargo() .getText());
		    funcionario.setSenha(frame. getTxtSenha() .getText());
	        
	        FuncionarioService service = new FuncionarioService();       
	   
	        service.deletar(funcionario);}
	   
	   
	   
	   public  Funcionario pesquisar(AdminManterFuncionario frame) {
		   
		
		 
		    Funcionario  fpesquisa = new Funcionario();
		    Funcionario f = new Funcionario ();
		  
		    
		    fpesquisa.setMatricula(Integer.parseInt(frame.getTxtPesquisar().getText()));
		    FuncionarioDao fpe =  new FuncionarioDao();
	        f=  fpe.pesquisarFuncionario(fpesquisa);
	        
	        
	       
	        return  f ;        
	       }
	   
	  
	   
	   
	   
   
    

   

}