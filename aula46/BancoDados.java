package com.keven.cursojava.aula46;

public interface BancoDados extends SqlDCL, SqlDML, SqlDDL{
	
	void abrirConecxao();
	void fecharConecxao();

}
