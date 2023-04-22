package br.com.felipearruda.factory.app.dbadapter.after;

import br.com.felipearruda.factory.app.dbadapter.after.db.DB;
import br.com.felipearruda.factory.app.dbadapter.after.factory.DBFactory;
import br.com.felipearruda.factory.app.dbadapter.after.factory.OracleDBFactory;
import br.com.felipearruda.factory.app.dbadapter.after.factory.PostgreDBFactory;

public class Client {

	public static void main(String[] args) {
		DB db = new OracleDBFactory().getDataBase();
		db.query("SELECT * FROM users");
		db.update("INSERT INTO users VALUES ('User', 25)");
		
		//O que acontece se eu tiver que mudar para um banco de dados postgres?
		DB postDB = new PostgreDBFactory().getDataBase();
		postDB.query("SELECT * FROM users");
		postDB.update("INSERT INTO users VALUES ('User', 25)");
	}
}
