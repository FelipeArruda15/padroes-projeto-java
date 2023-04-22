package br.com.felipearruda.factory.app.dbadapter.after.factory;

import br.com.felipearruda.factory.app.dbadapter.after.db.DB;
import br.com.felipearruda.factory.app.dbadapter.after.db.PostgreDB;

public class PostgreDBFactory implements DBFactory{

    @Override
    public DB getDataBase() {
        return new PostgreDB();
    }
    
}
