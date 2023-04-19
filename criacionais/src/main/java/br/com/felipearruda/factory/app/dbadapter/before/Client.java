package br.com.felipearruda.factory.app.dbadapter.before;

import br.com.felipearruda.factory.app.dbadapter.before.db.OracleDB;

public class Client {

	public static void main(String[] args) {
		OracleDB db = new OracleDB();
		db.query("SELECT * FROM users");
		db.update("INSERT INTO users VALUES ('User', 25)");
		
		//O que acontece se eu tiver que mudar para um banco de dados postgres?
	}
}
