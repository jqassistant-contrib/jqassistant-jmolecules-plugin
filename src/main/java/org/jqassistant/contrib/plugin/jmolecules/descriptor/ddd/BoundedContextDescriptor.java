package org.jqassistant.contrib.plugin.jmolecules.descriptor.ddd;

import com.buschmais.xo.neo4j.api.annotation.Label;
import org.jqassistant.contrib.plugin.jmolecules.report.DDDLanguage;

import static org.jqassistant.contrib.plugin.jmolecules.report.DDDLanguage.DDDLanguageElement.BoundedContext;

@DDDLanguage(BoundedContext)
@Label(value = "BoundedContext")
public interface BoundedContextDescriptor extends DDDDescriptor {

    String getName();

}
