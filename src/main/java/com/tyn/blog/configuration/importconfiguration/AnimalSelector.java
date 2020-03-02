package com.tyn.blog.configuration.importconfiguration;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author wangl
 * @Description todo
 * @date 12/25/2019 10:11 AM
 */
public class AnimalSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.tyn.blog.configuration.importconfiguration.Cat"};
    }
}
