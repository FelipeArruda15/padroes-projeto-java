package br.com.felipearruda.factory.app.dbadapter.after.factory;

import br.com.felipearruda.factory.app.dbadapter.after.db.DB;
import br.com.felipearruda.factory.app.dbadapter.after.db.OracleDB;

public class OracleDBFactory implements DBFactory {

    @Override
    public DB getDataBase() {
        return new OracleDB();
    }
    
}
