package br.com.felipearruda.abstractfactory.apple.factory.abstractFactory;

import br.com.felipearruda.abstractfactory.apple.model.certificate.Certificate;
import br.com.felipearruda.abstractfactory.apple.model.certificate.USCertificate;
import br.com.felipearruda.abstractfactory.apple.model.packing.Packing;
import br.com.felipearruda.abstractfactory.apple.model.packing.USPacking;

public class USRulesFactory implements CountryRulesAbstractFactory {

    @Override
    public Certificate getCertificates() {
        return new USCertificate();
    }

    @Override
    public Packing getPacking() {
        return new USPacking();
    }
    
}
