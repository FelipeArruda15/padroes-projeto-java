package br.com.felipearruda.abstractfactory.apple.factory.abstractFactory;

import br.com.felipearruda.abstractfactory.apple.model.certificate.Certificate;
import br.com.felipearruda.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
