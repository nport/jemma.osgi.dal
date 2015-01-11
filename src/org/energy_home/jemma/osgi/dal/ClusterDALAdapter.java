package org.energy_home.jemma.osgi.dal;

import org.energy_home.jemma.ah.hac.IAttributeValue;
import org.osgi.service.dal.FunctionData;

public interface ClusterDALAdapter {

	public FunctionData getMatchingPropertyValue(String attributeName, IAttributeValue attributeValue);

}
