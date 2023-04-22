package br.com.felipearruda.factory.app.dbadapter.after.db;

public class PostgreDB implements DB {

    @Override
    public void query(String sql) {
        System.out.println("Querying " + sql + " in Postgre database");
    }

    @Override
    public void update(String sql) {
        System.out.println("Uptade querry " + sql + " in Postgre database");
    }
    
}
